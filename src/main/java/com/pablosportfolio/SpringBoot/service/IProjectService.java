/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.pablosportfolio.SpringBoot.service;

import com.pablosportfolio.SpringBoot.model.Project;
import java.util.List;

/**
 *
 * @author pablo
 */
public interface IProjectService {
    public List<Project> getProjects();
    public void addProject(Project project);
    public void deleteProject(int idProject);
    public Project getProject(int idProject);
}
