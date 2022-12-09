package tn.spring.springdatajpa.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.spring.springdatajpa.entities.Contrat;
import tn.spring.springdatajpa.entities.Departement;
import tn.spring.springdatajpa.entities.Equipe;
import tn.spring.springdatajpa.entities.Etudiant;
import tn.spring.springdatajpa.services.IEtudiantService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Etudiant")
public class EtudiantController {
    IEtudiantService etudiantService;
    @PostMapping("/add")
    Etudiant ajouterEtudiant(@RequestBody Etudiant etudiant)
    {
        return etudiantService.ajouterEtudiant(etudiant);
    }

    @PutMapping("/update")
    Etudiant updateEtudiant(@RequestBody Etudiant etudiant)
    {
        return etudiantService.updateEtudiant(etudiant);
    }

    @GetMapping("/")
    List<Etudiant> retriveAllEtudiant()
    {
        return etudiantService.retriveAllEtudiant();
    }

    @GetMapping("/find/{id}")
    Etudiant retrieveEtudiant(@PathVariable int id)
    {
        return etudiantService.retriveEtudiant(id);
    }
    @DeleteMapping("/delete/{id}")
    void deleteEtudiant(@PathVariable int id)
    {
        etudiantService.deleteEtudiant(id);
    }


    @PutMapping("/assignEtudiantToDepartement/{etudiantId}/{departementId}")
    void assignEtudiantToDepartement (@PathVariable Integer etudiantId,@PathVariable Integer departementId)
    {
        etudiantService.assignEtudiantToDepartement(etudiantId,departementId);
    }

    @PutMapping ("/addAndassignEtudiant/{idContrat}/{idEquipe}")
    void addAndAssignEtudiantToEquipeAndContract(@RequestBody Etudiant e,@PathVariable Integer idContrat,@PathVariable Integer idEquipe)
    {
        etudiantService.addAndAssignEtudiantToEquipeAndContract(e,idContrat,idEquipe);
    }

    @GetMapping("/getbydep/{idDepartement}")
    List<Etudiant> getEtudiantsByDepartement(@PathVariable Integer idDepartement){
        return etudiantService.getEtudiantsByDepartement(idDepartement);
    }


}