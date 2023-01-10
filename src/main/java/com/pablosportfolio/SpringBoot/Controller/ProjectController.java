/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pablosportfolio.SpringBoot.Controller;

import com.pablosportfolio.SpringBoot.model.Project;
import com.pablosportfolio.SpringBoot.service.IProjectService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author pablo
 */
@RestController
public class ProjectController {
    @Autowired
    private IProjectService projectServ;
    // Project
    @CrossOrigin("*")
    @GetMapping ("/project")
    @ResponseBody
     public List<Project> getProject(){
         return this.projectServ.getProjects();
     }    
    @CrossOrigin("*")
    @PostMapping ("/project")
     public void addProject(@RequestBody Project project){
         this.projectServ.addProject(project);
     }
    @CrossOrigin("*")
    @DeleteMapping  ("/project/{id}") 
    @ResponseBody
     public void delProject(@PathVariable int id){
         this.projectServ.deleteProject(id);
     }
}
