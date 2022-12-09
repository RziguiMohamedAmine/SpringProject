package tn.spring.springdatajpa.services;

import tn.spring.springdatajpa.entities.Contrat;

import java.util.Date;
import java.util.List;

public interface IContratService {

    Contrat ajouterContrat(Contrat contrat);
    Contrat updateContrat(Contrat contrat);
    List<Contrat> retriveAllContrat();
    Contrat retriveContrat(int id);
    void deleteContrat(int id);
    Contrat affectContratToEtudiant (Contrat ce,String nomE,String prenomE);
    float getChiffreAffaireEntreDeuxDate(Date startDate, Date endDate);

    Integer nbContratsValides(Date startDate, Date endDate);
}