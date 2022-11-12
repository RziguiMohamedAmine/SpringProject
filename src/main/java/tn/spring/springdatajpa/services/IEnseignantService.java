package tn.spring.springdatajpa.services;

import tn.spring.springdatajpa.entities.Enseignant;

import java.util.List;

public interface IEnseignantService {
    Enseignant AjouterEnseignant(Enseignant enseignant);
    Enseignant UpdateEnseignant(Enseignant enseignant);
    List<Enseignant> RetrieveAllEnseignants();
    Enseignant RetrieveEnseignant(int id);
    void DeleteEnseignant(int id);

}
