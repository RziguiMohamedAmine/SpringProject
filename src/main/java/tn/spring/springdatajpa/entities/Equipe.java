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
public class Equipe implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private int idEquipe;
    private String nomEquipe;
    @Enumerated(EnumType.STRING)
    private Niveau niveau;

    @OneToOne(cascade = CascadeType.ALL)
    private DetailEquipe detailEquipe;

    @ManyToMany
    private Set<Etudiant> etudiants;
}
