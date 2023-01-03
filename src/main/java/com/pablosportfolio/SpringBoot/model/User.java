/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pablosportfolio.SpringBoot.model;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author pablo
 */
@Getter @Setter
public class User {
    private int idUser;
    private String userName;
    private String password;

    public User(int idUser, String userName, String password) {
        this.idUser = idUser;
        this.userName = userName;
        this.password = password;
    }
    
}
