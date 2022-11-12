package tn.spring.springdatajpa.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.spring.springdatajpa.entities.Departement;
import tn.spring.springdatajpa.entities.Etudiant;
import tn.spring.springdatajpa.entities.Universite;
import tn.spring.springdatajpa.repositories.DepartementRepository;
import tn.spring.springdatajpa.repositories.UniversiteRipository;

import java.util.List;
import java.util.Set;

@Service
@Slf4j
public class DepartementService implements IDepartementService{
    @Autowired
    DepartementRepository departementRepository;

    @Autowired
    UniversiteRipository universiteRipository;
    EtudiantService ets;
    Set<Etudiant> set;
    List<Etudiant> lE;
    @Override
    public Departement ajouterDepartement(Departement departement) {
        return departementRepository.save(departement);
    }

    @Override
    public Departement updateDepartement(Departement departement) {
        return departementRepository.save(departement);
    }

    @Override
    public List<Departement> retriveAllDepartement() {
        return departementRepository.findAll();
    }

    @Override
    public Departement retriveDepartement(int id) {
        return departementRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteDepartement(int id) {
        departementRepository.deleteById(id);
    }


    @Override
    public List<Etudiant> getEtudiantsByDepartement(Integer idDepartement)
    {
        Departement departement =retriveDepartement(idDepartement);
        lE.add((Etudiant) departement.getEtudiants());

        return lE;
    }

    @Override
    public Set<Departement> retrieveDepartementsByUniversite(Integer idUniversite)
    {
        Universite u = universiteRipository.findById(idUniversite).orElse(null);
        return u.getDepartements();
    }

}
