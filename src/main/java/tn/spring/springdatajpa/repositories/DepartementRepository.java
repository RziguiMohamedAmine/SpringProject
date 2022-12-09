package tn.spring.springdatajpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.spring.springdatajpa.entities.Departement;

public interface DepartementRepository extends JpaRepository<Departement,Integer> {


}