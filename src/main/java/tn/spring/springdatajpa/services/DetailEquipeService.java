package tn.spring.springdatajpa.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.spring.springdatajpa.entities.DetailEquipe;
import tn.spring.springdatajpa.repositories.DetailEquipeRepository;

import java.util.List;

@Service
@Slf4j
public class DetailEquipeService implements IDeatilEquipeService{
    @Autowired
    DetailEquipeRepository detailEquipeRepository;

    @Override
    public DetailEquipe ajouterDetail(DetailEquipe detailEquipe) {
        return detailEquipeRepository.save(detailEquipe);
    }

    @Override
    public DetailEquipe updateDetail(DetailEquipe detailEquipe)
    {
        return detailEquipeRepository.save(detailEquipe);
    }

    @Override
    public List<DetailEquipe> retriveAllDetail() {
        return detailEquipeRepository.findAll();
    }

    @Override
    public DetailEquipe retriveDetail(int id) {
        return detailEquipeRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteDetail(int id) {
        detailEquipeRepository.deleteById(id);
    }
}