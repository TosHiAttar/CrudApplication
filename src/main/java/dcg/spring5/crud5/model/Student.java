package dcg.spring5.crud5.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Setter
@Getter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode(of = {"sno"})
@Table(name = "student")
public class Student {

    @Id
    @Column(name = "sno")
    @NotNull(message = "please Enter StudentNo")
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private Integer sno;

    @NotNull(message = "please Enter Student Name")
    @Column(name = "sname")
    private String sname;

    @NotNull(message = "please Enter Student Age")
    @Column(name = "age")
    private Integer age;

}


