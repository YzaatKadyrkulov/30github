package trilegi.hospital.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "contact_infos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@SequenceGenerator(name = "base_id_gen", sequenceName = "contact_info_seq", allocationSize = 1)
public class ContactInfo extends BaseEntity {
    private String phoneNumber;
    private String email;
    private String address;
    private String emergencyContact;
    private String something;

    @OneToOne(mappedBy = "contactInfo")
    private Patient patient;
}

