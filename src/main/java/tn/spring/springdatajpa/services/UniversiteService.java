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
public class UniversiteService implements IUniversiteService{
    @Autowired
    UniversiteRipository universiteRipository;

    @Autowired
    DepartementRepository departementRepository;

    @Override
    public Universite ajouterUniversite(Universite universite) {
        return universiteRipository.save(universite);
    }

    @Override
    public Universite updateUniversite(Universite universite) {
        return universiteRipository.save(universite);
    }

    @Override
    public List<Universite> retriveAllUniversite() {
        return universiteRipository.findAll();
    }

    @Override
    public Universite retriveUniversite(int id) {
        return universiteRipository.findById(id).orElse(null);
    }

    @Override
    public void deleteUniversite(int id) {
        universiteRipository.deleteById(id);
    }

    /*ou

    public UniversiteService(UniversiteRipository universiteRipository) {
        this.universiteRipository = universiteRipository;
    }
     */
    @Override
    public void assignUniversiteToDepartement(Integer idUniversite, Integer idDepartement)
    {
        Universite universite=universiteRipository.findById(idUniversite).orElse(null);
        Departement departement= departementRepository.findById(idDepartement).orElse(null);
        universite.getDepartements().add(departement);
        universiteRipository.save(universite);
    }

}