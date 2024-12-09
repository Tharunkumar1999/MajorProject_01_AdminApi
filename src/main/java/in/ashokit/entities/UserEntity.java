package in.ashokit.entities;

import java.time.LocalDate;
import java.util.List;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="IES_USERS")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Integer UserId;
    private String fullName;
    private String email;
    private String pwd;
    private Long mobileNo;
    private String gender;
    private LocalDate dob;
    private Long ssn;
    private String accStatus;
    private String activeSw;

    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    private List<PlanEntity> plans;


}
