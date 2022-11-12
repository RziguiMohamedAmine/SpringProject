package tn.spring.springdatajpa.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import tn.spring.springdatajpa.entities.Contrat;
import tn.spring.springdatajpa.repositories.ContratRepository;
import tn.spring.springdatajpa.services.IContratService;

import java.util.Date;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Contrat")
@Tag(name = "Contrat Management")
public class ContratController {
    IContratService contratService;
    @PostMapping("/ajouterContrat")
    Contrat ajouterContrat(@RequestBody Contrat contrat)
    {
     return contratService.ajouterContrat(contrat);
    }

    @PutMapping("/updateContrat")
    Contrat updateContrat(@RequestBody Contrat contrat)
    {
        return contratService.updateContrat(contrat);
    }

    @GetMapping("/afficheAllContrats")
    List<Contrat> retriveAllContrat()
    {
        return contratService.retriveAllContrat();
    }

    @Operation(description = "Retrieve all Contrats")
    @GetMapping("/afficheContrat/{id}")
    Contrat retriveContrat(@PathVariable int id)
    {
        return contratService.retriveContrat(id);
    }
    @DeleteMapping("/deleteContrat/{id}")
    void deleteContrat(@PathVariable int id)
    {
         contratService.deleteContrat(id);
    }

    @PutMapping("/affectContratToEtudiant/{nom}/{prenom}")
    void affectContratToEtudiant(@RequestBody Contrat c,@PathVariable String nom,@PathVariable String prenom)
    {
        contratService.affectContratToEtudiant(c,nom,prenom);
    }

    @GetMapping("/chiffreAffaire/{startDate}/{endDate}")
    void getChiffreAffaireEntreDeuxDate(@PathVariable Date startDate,@PathVariable Date endDate)
    {
        contratService.getChiffreAffaireEntreDeuxDate(startDate,endDate);
    }



}
