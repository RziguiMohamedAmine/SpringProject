package tn.spring.springdatajpa.services;

import tn.spring.springdatajpa.entities.Contrat;
import tn.spring.springdatajpa.entities.DetailEquipe;

import java.util.List;

public interface IDeatilEquipeService {
    DetailEquipe ajouterDetail(DetailEquipe detailEquipe);
    DetailEquipe updateDetail(DetailEquipe detailEquipe);
    List<DetailEquipe> retriveAllDetail();
    DetailEquipe retriveDetail(int id);
    void deleteDetail(int id);
}
