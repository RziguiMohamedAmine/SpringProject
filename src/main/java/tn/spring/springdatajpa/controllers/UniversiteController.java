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
    @PostMapping("/ajouterUniversite")
    Universite ajouterUniversite(@RequestBody Universite universite)
    {
        return universiteService.ajouterUniversite(universite);
    }

    @PutMapping("/updateUniversite")
    Universite updateUniversite(@RequestBody Universite Universite)
    {
        return universiteService.updateUniversite(Universite);
    }

    @GetMapping("/afficheAllUniversites")
    List<Universite> retriveAllUniversite()
    {
        return universiteService.retriveAllUniversite();
    }

    @GetMapping("/afficheUniversite/{id}")
    Universite retriveUniversite(@PathVariable int id)
    {
        return universiteService.retriveUniversite(id);
    }
    @DeleteMapping("/deleteUniversite/{id}")
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
