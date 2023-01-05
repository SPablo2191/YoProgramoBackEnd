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
public class Work {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idWork;
    private String businessName;
    private String role;
    private Date startDate;
    private Date endDate;

    public Work() {
    }

    public Work(int idWork, String businessName, String role, Date startDate, Date endDate) {
        this.idWork = idWork;
        this.businessName = businessName;
        this.role = role;
        this.startDate = startDate;
        this.endDate = endDate;
    }
    
}
