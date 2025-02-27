package trilegi.hospital.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "departments")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@SequenceGenerator(name = "base_id_gen", sequenceName = "department_seq", allocationSize = 1)
public class Department extends BaseEntity{
    private String name; // Терапевтическое, хирургическое и т. д.
    private String description;
    private String remote;

    @OneToMany(mappedBy = "department")
    private List<Doctor> doctors;
}
