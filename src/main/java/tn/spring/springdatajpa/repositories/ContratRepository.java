package tn.spring.springdatajpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import tn.spring.springdatajpa.entities.Contrat;

import java.util.Date;
import java.util.List;

public interface ContratRepository extends JpaRepository<Contrat,Integer> {

    List<Contrat> findByEtudiantIdEtudiantAndArchive(int idEtudiant,boolean archive);
    List<Contrat> findByDateFinContratBetween(Date date1, Date date2);
}