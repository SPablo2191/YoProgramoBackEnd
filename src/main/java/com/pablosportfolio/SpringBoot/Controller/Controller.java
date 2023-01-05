/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pablosportfolio.SpringBoot.Controller;

import com.pablosportfolio.SpringBoot.model.Knowledge;
import com.pablosportfolio.SpringBoot.model.User;
import com.pablosportfolio.SpringBoot.service.IUserService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
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
public class Controller{
    @Autowired
    private IUserService userServ;
    private List<Knowledge> knows = new ArrayList<Knowledge>();
    
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
     
     // User
     @GetMapping ("/user")
     @ResponseBody
     public List<User> getUsers(){
         return this.userServ.getUsers();
     }
     @PostMapping ("/user")
     public void addKnowledge(@RequestBody User user){
         this.userServ.addUser(user);
     }
     
     
     
    // Knowledge
    @GetMapping ("/knowledge")
    @ResponseBody
     public List<Knowledge> getKnowledge(){
         return this.knows;
     }
     @PostMapping ("/knowledge")
     public void addKnowledge(@RequestBody Knowledge knowledge){
         this.knows.add(knowledge);
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
