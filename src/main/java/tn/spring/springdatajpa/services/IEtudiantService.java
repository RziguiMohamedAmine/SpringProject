package tn.spring.springdatajpa.services;

import tn.spring.springdatajpa.entities.Contrat;
import tn.spring.springdatajpa.entities.Etudiant;

import java.util.List;

public interface IEtudiantService {

    Etudiant ajouterEtudiant(Etudiant etudiant);
    Etudiant updateEtudiant(Etudiant etudiant);
    List<Etudiant> retriveAllEtudiant();
    Etudiant retriveEtudiant(int id);
    void deleteEtudiant(int id);


    void assignEtudiantToDepartement (Integer etudiantId, Integer departementId) ;

    Etudiant addAndAssignEtudiantToEquipeAndContract(Etudiant e, Integer idContrat, Integer idEquipe);
    List<Etudiant> getEtudiantsByDepartement (Integer idDepartement);
    Etudiant retriveEtudiantByName(String nom,String prenom);

}
