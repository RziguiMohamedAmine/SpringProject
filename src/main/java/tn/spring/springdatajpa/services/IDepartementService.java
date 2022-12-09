package tn.spring.springdatajpa.services;
import tn.spring.springdatajpa.entities.Departement;
import tn.spring.springdatajpa.entities.Etudiant;

import java.util.List;
import java.util.Set;

public interface IDepartementService {
    Departement  ajouterDepartement(Departement departement);
    Departement updateDepartement(Departement departement);
    List<Departement> retriveAllDepartement();
    Departement retriveDepartement(int id);
    void deleteDepartement(int id);

    List<Etudiant> getEtudiantsByDepartement (Integer idDepartement);

    public Set<Departement> retrieveDepartementsByUniversite(Integer idUniversite);
}