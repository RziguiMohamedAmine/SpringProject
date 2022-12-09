package tn.spring.springdatajpa.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Project implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private int idProject;
    private String nameProject;
    private String descriptionProject;
    private Date deadLine;
    private String statusProject;

    @OneToOne
    private Equipe team;


}
