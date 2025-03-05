package trilegi.hospital.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "medical_histories")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@SequenceGenerator(name = "base_id_gen", sequenceName = "medical_history_seq", allocationSize = 1)
public class MedicalHistory extends BaseEntity {
    private String diagnosis;
    private String treatment;
    private LocalDate diagnosisDate;
    private LocalDate recoveryDate;
    private String doctorNotes;
    private String something;
    private String love;
    private String weDt;
    @ManyToOne
    private Patient patient;
}
