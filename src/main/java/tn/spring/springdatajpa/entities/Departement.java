package tn.spring.springdatajpa.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Departement implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private int idDepar;
    private String nomDepar;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="departement")
    private Set<Etudiant> etudiants;
}
