/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pablosportfolio.SpringBoot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.Date;
import lombok.Data;

/**
 *
 * @author pablo
 */
@Data
@Entity
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idProject;
    private String title;
    private String description;
    private String source;
    private Date releaseDate;

    public Project(int idProject, String title, String description, String source, Date releaseDate) {
        this.idProject = idProject;
        this.title = title;
        this.description = description;
        this.source = source;
        this.releaseDate = releaseDate;
    }
    
    
}
