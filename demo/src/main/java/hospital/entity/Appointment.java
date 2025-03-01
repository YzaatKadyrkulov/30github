package trilegi.hospital.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.*;
import trilegi.hospital.enums.Status;

import java.time.LocalDateTime;

@Entity
@Table(name = "appointments")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@SequenceGenerator(name = "base_id_gen", sequenceName = "appointment_seq", allocationSize = 1)
public class Appointment extends BaseEntity{
    private LocalDateTime appointmentDate;
    private Status status;
    private String delete;
    private byte something;
    private int remote;

    @ManyToOne
    private Patient patient;

    @ManyToOne
    private Doctor doctor;
}
