/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pablosportfolio.SpringBoot.model;

import java.util.Date;
import lombok.Data;

/**
 *
 * @author pablo
 */
@Data
public class Study {
    private int idStudy;
    private String title;
    private String description;
    private Date startDate;
    private Date endDate;

    public Study(int idStudy, String title, String description, Date startDate, Date endDate) {
        this.idStudy = idStudy;
        this.title = title;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
    }
    
}
