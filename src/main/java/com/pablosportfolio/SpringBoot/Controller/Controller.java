/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pablosportfolio.SpringBoot.Controller;

import com.pablosportfolio.SpringBoot.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author pablo
 */
@RestController
public class Controller {
    //home
    @GetMapping ("/home")
    
    public String home(){
        return "Bievenido a mi portfolio API";
    }
    // Auth
    @PostMapping ("/auth")
    @ResponseBody // retornar como json nuestras instancias
     public void authUser(@RequestBody User user){
         
     }
    // Knowledge
    @GetMapping ("/knowledge")
     public void getKnowledge(){
         
     }
    // Project
    @GetMapping ("/project")
     public void getProject(){
         
     }
    // Study
    @GetMapping ("/study")
     public void getStudy(){
         
     }
    // Work
    @GetMapping ("/work")
     public void getWork(){
         
     }
}
