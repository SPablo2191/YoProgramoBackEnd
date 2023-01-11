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
public class Session {
    private User user;
    private String authToken;

    public Session(User user, String authToken) {
        this.user = user;
        this.authToken = authToken;
    }

    public Session() {
    }
    
    
}
