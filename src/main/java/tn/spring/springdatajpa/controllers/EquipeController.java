package tn.spring.springdatajpa.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.spring.springdatajpa.entities.Equipe;
import tn.spring.springdatajpa.services.IEquipeService;


import java.util.List;

@RestController //ou @Controller
@AllArgsConstructor
@RequestMapping("/Equipe")
public class EquipeController {
    IEquipeService equipeService;
    @PostMapping("/ajouterEquipe")
    Equipe ajouterEquipe(@RequestBody Equipe equipe)
    {
        return equipeService.ajouterEquipe(equipe);
    }

    @PutMapping("/updateEquipe")
    Equipe updateEquipe(@RequestBody Equipe equipe)
    {
        return equipeService.updateEquipe(equipe);
    }

    @GetMapping("/afficheAllEquipes")
    List<Equipe> retriveAllEquipe()
    {
        return equipeService.retriveAllEquipe();
    }

    @GetMapping("/afficheEquipe/{id}")
    Equipe retriveEquipe(@PathVariable int id)
    {
        return equipeService.retriveEquipe(id);
    }
    @DeleteMapping("/deleteEquipe/{id}")
    void deleteEquipe(@PathVariable int id)
    {
        equipeService.deleteEquipe(id);
    }


}
