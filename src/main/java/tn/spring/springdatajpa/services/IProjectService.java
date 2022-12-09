package tn.spring.springdatajpa.services;

import tn.spring.springdatajpa.entities.Project;

import java.util.List;

public interface IProjectService {

    Project add(Project project);
    Project update(Project project);
    List<Project> findAll();
    Project find(int id);
    void delete(int id);

    void assignTeamToProject(int idTeam,int idProject);

    List<Project> findByStatus(String statusProject);

}
