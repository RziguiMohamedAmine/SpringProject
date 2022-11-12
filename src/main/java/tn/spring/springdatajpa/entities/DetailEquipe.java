package tn.spring.springdatajpa.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DetailEquipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private int idDetailEquipe;
    private int salle;
    private String thematique;
    @OneToOne(mappedBy="detailEquipe")
    @JsonIgnore
    private Equipe equipe;
}
