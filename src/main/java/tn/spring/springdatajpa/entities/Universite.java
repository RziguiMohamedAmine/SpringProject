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
public class Universite implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private int idUniversite;
    private String nomUniversite;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Departement> departements;
}
