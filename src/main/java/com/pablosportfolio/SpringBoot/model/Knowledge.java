/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pablosportfolio.SpringBoot.model;

import lombok.Data;

/**
 *
 * @author pablo
 */
@Data
public class Knowledge {
    private int idKnowledge;
    private int value;
    private String name;
    private String color;

    public Knowledge(int idKnowledge, int value, String name, String color) {
        this.idKnowledge = idKnowledge;
        this.value = value;
        this.name = name;
        this.color = color;
    }
    
}
