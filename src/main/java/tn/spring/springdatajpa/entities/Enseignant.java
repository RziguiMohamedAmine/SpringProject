package tn.spring.springdatajpa.entities;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Enseignant implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private int idEnseignant;
    private String prenomE;
    private String nomE;

    @Enumerated(EnumType.STRING)
    private Grade grade;

    @ManyToOne
    Departement departement;


}
