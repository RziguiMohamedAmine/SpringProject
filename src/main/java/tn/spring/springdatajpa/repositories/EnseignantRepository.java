package tn.spring.springdatajpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.spring.springdatajpa.entities.Enseignant;

public interface EnseignantRepository extends JpaRepository<Enseignant,Integer> {
}
