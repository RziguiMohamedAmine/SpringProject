package tn.spring.springdatajpa.services;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.spring.springdatajpa.entities.Enseignant;
import tn.spring.springdatajpa.repositories.EnseignantRepository;

import java.util.List;

@Service
@Slf4j
public class EnseignantService implements IEnseignantService{

    @Autowired
    EnseignantRepository enseignantRepository;

    @Override
    public Enseignant AjouterEnseignant(Enseignant enseignant) {
        return enseignantRepository.save(enseignant);
    }

    @Override
    public Enseignant UpdateEnseignant(Enseignant enseignant) {
        return enseignantRepository.save(enseignant);
    }

    @Override
    public List<Enseignant> RetrieveAllEnseignants() {
        return enseignantRepository.findAll();
    }

    @Override
    public Enseignant RetrieveEnseignant(int id) {
        return enseignantRepository.findById(id).orElse(null);
    }

    @Override
    public void DeleteEnseignant(int id) {
        enseignantRepository.deleteById(id);
    }
}
