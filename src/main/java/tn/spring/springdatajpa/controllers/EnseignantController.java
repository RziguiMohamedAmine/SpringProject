package tn.spring.springdatajpa.controllers;


import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.spring.springdatajpa.services.IEnseignantService;

@RestController
@AllArgsConstructor
@RequestMapping("/Enseignant")
@Tag(name = "Enseignant Management")
public class EnseignantController {
    IEnseignantService enseignantService;



}
