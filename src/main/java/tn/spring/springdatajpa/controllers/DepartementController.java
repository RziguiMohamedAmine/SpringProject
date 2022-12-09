package tn.spring.springdatajpa.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.spring.springdatajpa.entities.Departement;
import tn.spring.springdatajpa.entities.Etudiant;
import tn.spring.springdatajpa.services.IDepartementService;

import java.util.List;
import java.util.Set;

@RestController
@AllArgsConstructor
@RequestMapping("/Departement")
public class DepartementController {
    IDepartementService departementService;

    @PostMapping("/add")
    Departement ajouterDepartement(@RequestBody Departement departement)
    {
        return departementService.ajouterDepartement(departement);
    }

    @PutMapping("/update")
    Departement updateDepartement(@RequestBody Departement departement)
    {
        return departementService.updateDepartement(departement);
    }

    @GetMapping("/")
    List<Departement> retriveAllDepartement()
    {
        return departementService.retriveAllDepartement();
    }

    @GetMapping("/find/{id}")
    Departement retrieveDepartment(@PathVariable int id)
    {
        return departementService.retriveDepartement(id);
    }
    @DeleteMapping("/delete/{id}")
    void deleteDepartement(@PathVariable int id)
    {
        departementService.deleteDepartement(id);
    }

    @GetMapping("/getEtudiantsByDepartement/{idDepartement}")
    List<Etudiant> getEtudiantsByDepartement(@PathVariable Integer idDepartement)
    {
        return departementService.getEtudiantsByDepartement(idDepartement);
    }

    @GetMapping("/getByUniv/{idUniversite}")
    Set<Departement> retrieveDepartementsByUniversite(@PathVariable Integer idUniversite)
    {
        return departementService.retrieveDepartementsByUniversite(idUniversite);
    }

}