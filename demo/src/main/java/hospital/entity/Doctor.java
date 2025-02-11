package trilegi.hospital.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "doctors")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@SequenceGenerator(name = "base_id_gen", sequenceName = "doctor_seq", allocationSize = 1)
public class Doctor extends BaseEntity{
    private String firstName;
    private String lastName;
    private String specialization;
    private String phoneNumber;
    private String email;
    private String something;
    private String love;
    private String lj;
    private String sdf;
    private String did;
    @OneToMany(mappedBy = "doctor")
    private List<Appointment> appointments;

    @ManyToOne
    private Department department;
}
