package tn.spring.springdatajpa.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.spring.springdatajpa.entities.Equipe;
import tn.spring.springdatajpa.entities.Project;
import tn.spring.springdatajpa.repositories.EquipeRepository;
import tn.spring.springdatajpa.repositories.ProjectRepository;

import java.util.List;

@Service
@Slf4j
public class ProjectService implements IProjectService{

    @Autowired
    ProjectRepository projectRepository;

    @Autowired
    EquipeRepository equipeRepository;

    @Override
    public Project add(Project project) {
        return projectRepository.save(project);
    }

    @Override
    public Project update(Project project) {
        return projectRepository.save(project);
    }

    @Override
    public List<Project> findAll() {
        return projectRepository.findAll();
    }

    @Override
    public Project find(int id) {
        return projectRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(int id) {
        projectRepository.deleteById(id);
    }

    @Override
    public void assignTeamToProject(int idTeam, int idProject) {
        Project project = projectRepository.findById(idProject).orElse(null);
        if(project == null)
            return;
        Equipe equipe = equipeRepository.findById(idTeam).orElse(null);
        project.setTeam(equipe);
        projectRepository.save(project);
    }

    @Override
    public List<Project> findByStatus(String statusProject) {
        return projectRepository.findByStatusProject(statusProject);
    }


}
