package tn.spring.springdatajpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import tn.spring.springdatajpa.entities.Departement;
import tn.spring.springdatajpa.entities.Universite;

import java.util.List;

public interface UniversiteRipository extends JpaRepository<Universite,Integer> {


}
