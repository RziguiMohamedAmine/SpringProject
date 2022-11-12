package tn.spring.springdatajpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import tn.spring.springdatajpa.entities.Equipe;

public interface EquipeRepository extends JpaRepository<Equipe,Integer> {
}
