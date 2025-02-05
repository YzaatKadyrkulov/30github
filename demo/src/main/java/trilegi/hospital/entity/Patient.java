package trilegi.hospital.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "patients")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@SequenceGenerator(name = "base_id_gen", sequenceName = "patient_seq", allocationSize = 1)
public class Patient extends BaseEntity {
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String gender;

    @OneToOne
    private ContactInfo contactInfo;

    @OneToMany(mappedBy = "patient", cascade = CascadeType.ALL)
    private List<MedicalHistory> medicalHistory;
}