package tn.spring.springdatajpa.controllers;

import io.swagger.v3.core.util.Json;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.spring.springdatajpa.entities.Project;
import tn.spring.springdatajpa.services.IProjectService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Project")
public class ProjectController {
    IProjectService projectService;
    @PostMapping("/add")
    Project add(@RequestBody Project project)
    {
     return projectService.add(project);
    }

    @PutMapping("/update")
    Project update(@RequestBody Project project)
    {
        return projectService.update(project);
    }

    @GetMapping("/")
    List<Project> findAll()
    {
        return projectService.findAll();
    }

    @GetMapping("/find/{id}")
    Project find(@PathVariable int id)
    {
        return projectService.find(id);
    }
    @DeleteMapping("/delete/{id}")
    void delete(@PathVariable int id)
    {
        projectService.delete(id);
    }

    @GetMapping("/findByStatus/{statusProject}")
    List<Project> findByStatus(@PathVariable String statusProject)
    {
        return projectService.findByStatus(statusProject);
    }

    @GetMapping("/{idProject}/assignTeam/{idTeam}")
    void assignTeamToProject(@PathVariable int idProject,@PathVariable int idTeam)
    {
         projectService.assignTeamToProject( idTeam,  idProject);
    }


}
