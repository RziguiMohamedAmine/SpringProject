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
    @PostMapping("/add")
    Equipe ajouterEquipe(@RequestBody Equipe equipe)
    {
        return equipeService.ajouterEquipe(equipe);
    }

    @PutMapping("/update")
    Equipe updateEquipe(@RequestBody Equipe equipe)
    {
        return equipeService.updateEquipe(equipe);
    }

    @GetMapping("/")
    List<Equipe> retrieveAllEquipe()
    {
        return equipeService.retriveAllEquipe();
    }

    @GetMapping("/find/{id}")
    Equipe retrieveEquipe(@PathVariable int id)
    {
        return equipeService.retriveEquipe(id);
    }
    @DeleteMapping("/delete/{id}")
    void deleteEquipe(@PathVariable int id)
    {
        equipeService.deleteEquipe(id);
    }


}