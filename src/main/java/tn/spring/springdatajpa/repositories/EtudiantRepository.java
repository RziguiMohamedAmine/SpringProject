package tn.spring.springdatajpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import tn.spring.springdatajpa.entities.Etudiant;
import tn.spring.springdatajpa.entities.Niveau;
import tn.spring.springdatajpa.entities.Option;
import tn.spring.springdatajpa.entities.Specialite;

import java.util.List;

public interface EtudiantRepository extends JpaRepository<Etudiant,Integer> {

    @Query("SELECT e FROM Etudiant e WHERE e.nomE = ?1 and e.prenomE=?2")
    Etudiant retriveEtudiantByNomEtPrenom(String nomE,String prenomE);

    Etudiant findByNomEAndPrenomE(String nom, String prenom);

    @Query(value = "Select e From Etudiant e where e.departement.idDepar =?1",nativeQuery = true)
    List<Etudiant> getEtudiantByDepartement(int idDep);


    List<Etudiant> findByDepartementIdDepar(int idDep);

    List<Etudiant> findByContratsSpecialite(Specialite spec);

    Integer countByEquipesNiveau(Niveau op);


}