package tn.spring.springdatajpa.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.spring.springdatajpa.entities.DetailEquipe;
import tn.spring.springdatajpa.services.IDeatilEquipeService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Detail")
public class DetailEquipeController {
    IDeatilEquipeService detailEquipeService;
    @PostMapping("/ajouterDetail")
    DetailEquipe ajouterDetail(@RequestBody DetailEquipe detailEquipe)
    {
        return detailEquipeService.ajouterDetail(detailEquipe);
    }

    @PutMapping("/updateDetail")
    DetailEquipe updateDetail(@RequestBody DetailEquipe detailEquipe)
    {
        return detailEquipeService.updateDetail(detailEquipe);
    }

    @GetMapping("/afficheAllDetail")
    List<DetailEquipe> retriveAllDetail()
    {
        return detailEquipeService.retriveAllDetail();
    }

    @GetMapping("/afficheDetail/{id}")
    DetailEquipe retriveDetail(@PathVariable int id)
    {
        return detailEquipeService.retriveDetail(id);
    }
    @DeleteMapping("/deleteDetail/{id}")
    void deleteDetail(@PathVariable int id)
    {
        detailEquipeService.deleteDetail(id);
    }
}
