package tn.spring.springdatajpa.services;

import tn.spring.springdatajpa.entities.Departement;
import tn.spring.springdatajpa.entities.Universite;

import java.util.List;

public interface IUniversiteService {
    Universite ajouterUniversite(Universite universite);
    Universite updateUniversite(Universite universite);
    List<Universite> retriveAllUniversite();
    Universite retriveUniversite(int id);
    void deleteUniversite(int id);
    public void assignUniversiteToDepartement(Integer idUniversite, Integer idDepartement);

}
