package tn.spring.springdatajpa.controllers;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.spring.springdatajpa.entities.Departement;
import tn.spring.springdatajpa.entities.Universite;
import tn.spring.springdatajpa.services.IUniversiteService;


import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Universite")
public class UniversiteController {
    IUniversiteService universiteService;
    @PostMapping("/add")
    Universite ajouterUniversite(@RequestBody Universite universite)
    {
        return universiteService.ajouterUniversite(universite);
    }

    @PutMapping("/update")
    Universite updateUniversite(@RequestBody Universite Universite)
    {
        return universiteService.updateUniversite(Universite);
    }

    @GetMapping("/")
    List<Universite> retrieveAllUniversite()
    {
        return universiteService.retriveAllUniversite();
    }

    @GetMapping("/find/{id}")
    Universite retrieveUniversite(@PathVariable int id)
    {
        return universiteService.retriveUniversite(id);
    }
    @DeleteMapping("/delete/{id}")
    void deleteUniversite(@PathVariable int id)
    {
        universiteService.deleteUniversite(id);
    }

    @PutMapping("/assignUniversiteToDep/{idUniversite}/{idDepartement}")
    public void assignUniversiteToDepartement(@PathVariable Integer idUniversite,@PathVariable Integer idDepartement)
    {
        universiteService.assignUniversiteToDepartement(idUniversite,idDepartement);
    }








}