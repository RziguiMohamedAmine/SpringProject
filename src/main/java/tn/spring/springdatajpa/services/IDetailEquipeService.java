package tn.spring.springdatajpa.services;

import tn.spring.springdatajpa.entities.DetailEquipe;

import java.util.List;

public interface IDetailEquipeService {

    List<DetailEquipe> retriveallDE();
    DetailEquipe addDE(DetailEquipe c);
    void deleteDE(Integer id);
    DetailEquipe UpdateDE(DetailEquipe c);
    DetailEquipe retrieveDE(Integer id);
}
