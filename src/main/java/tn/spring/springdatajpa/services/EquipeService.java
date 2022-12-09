package tn.spring.springdatajpa.services;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.spring.springdatajpa.entities.Equipe;
import tn.spring.springdatajpa.entities.Etudiant;
import tn.spring.springdatajpa.repositories.EquipeRepository;

import java.util.List;

@Service
@Slf4j
//@AllArgsConstructor pour injecter avec constructeur mais ina utiliser @Autowiered
public class EquipeService implements IEquipeService{
    @Autowired
    EquipeRepository equipeRepository;

    @Override
    public Equipe ajouterEquipe(Equipe equipe) {
        return equipeRepository.save(equipe);
    }

    @Override
    public Equipe updateEquipe(Equipe equipe) {
        return equipeRepository.save(equipe);
    }

    @Override
    public List<Equipe> retriveAllEquipe() {
        return equipeRepository.findAll();
    }

    @Override
    public Equipe retriveEquipe(int id) {
        return equipeRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteEquipe(int id) {
        equipeRepository.deleteById(id);
    }





}