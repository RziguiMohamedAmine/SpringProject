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
public class Etudiant implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private int idEtudiant;
    private String prenomE;
    private String nomE;
    @Enumerated(EnumType.STRING)
    private Option opt;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="etudiant")
    private Set<Contrat> contrats;

    @ManyToOne
    Departement departement;

    @ManyToMany(mappedBy="etudiants", cascade = CascadeType.ALL)
    private Set<Equipe> equipes;
}
