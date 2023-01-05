/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pablosportfolio.SpringBoot.service;

import com.pablosportfolio.SpringBoot.model.Project;
import com.pablosportfolio.SpringBoot.repository.ProjectRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author pablo
 */
public class ProjectService implements IProjectService {
    @Autowired
    public ProjectRepository projectRepo; 
    @Override
    public List<Project> getProjects() {
        return this.projectRepo.findAll();
    }

    @Override
    public void addProject(Project project) {
        this.projectRepo.save(project);
    }

    @Override
    public void deleteProject(int idProject) {
        this.projectRepo.deleteById(idProject);
    }

    @Override
    public Project getProject(int idProject) {
       return this.projectRepo.findById(idProject).orElse(null);
    }
    
}
