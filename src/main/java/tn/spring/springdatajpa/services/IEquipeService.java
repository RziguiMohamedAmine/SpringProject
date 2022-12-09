package tn.spring.springdatajpa.services;

import tn.spring.springdatajpa.entities.Equipe;
import tn.spring.springdatajpa.entities.Etudiant;

import java.util.List;

public interface IEquipeService {
    Equipe ajouterEquipe(Equipe equipe);
    Equipe updateEquipe(Equipe equipe);
    List<Equipe> retriveAllEquipe();
    Equipe retriveEquipe(int id);
    void deleteEquipe(int id);


}