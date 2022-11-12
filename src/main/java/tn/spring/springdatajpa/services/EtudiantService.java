package tn.spring.springdatajpa.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.spring.springdatajpa.entities.Contrat;
import tn.spring.springdatajpa.entities.Departement;
import tn.spring.springdatajpa.entities.Equipe;
import tn.spring.springdatajpa.entities.Etudiant;
import tn.spring.springdatajpa.repositories.ContratRepository;
import tn.spring.springdatajpa.repositories.DepartementRepository;
import tn.spring.springdatajpa.repositories.EquipeRepository;
import tn.spring.springdatajpa.repositories.EtudiantRepository;

import java.util.List;
import java.util.Set;

@Service
@Slf4j
public class EtudiantService implements IEtudiantService{
    @Autowired
    EtudiantRepository etudiantRepository;

    @Autowired
    DepartementRepository departementRepository;

    @Autowired
    ContratRepository contratRepository;

    @Autowired
    EquipeRepository equipeRepository;
    @Override
    public Etudiant ajouterEtudiant(Etudiant etudiant) {
       return etudiantRepository.save(etudiant);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    @Override
    public List<Etudiant> retriveAllEtudiant() {
        return etudiantRepository.findAll();
    }

    @Override
    public Etudiant retriveEtudiant(int id) {
        return etudiantRepository.findById(id).orElse(null);
    }

    @Override
    public Etudiant retriveEtudiantByName(String nom,String prenom) {
        return etudiantRepository.findByNomEAndPrenomE(nom,prenom);
    }
    @Override
    public void deleteEtudiant(int id) {
        etudiantRepository.deleteById(id);
    }



    @Override
    public void assignEtudiantToDepartement (Integer etudiantId, Integer departementId)
    {
        Etudiant etudiant =retriveEtudiant(etudiantId);
        // Etudiant etudiant=etudiantRepository.findById(id).orElse(null);
        Departement departement=departementRepository.findById(departementId).orElse(null);
        etudiant.setDepartement(departement);
        etudiantRepository.save(etudiant);
    }

    @Override
    public Etudiant addAndAssignEtudiantToEquipeAndContract(Etudiant e, Integer idContrat, Integer idEquipe)
    {
        Contrat contrat=contratRepository.findById(idContrat).orElse(null);
        Equipe equipe =equipeRepository.findById(idEquipe).orElse(null);
        contrat.setEtudiant(e);
        equipe.getEtudiants().add(e);
        return etudiantRepository.save(e);
    }




    @Override
    public List<Etudiant> getEtudiantsByDepartement(Integer idDepartement){
       // Departement d = departementRepository.findById(idDepartement).orElse(null);
        return etudiantRepository.findByDepartementIdDepar(idDepartement);
    }





}
