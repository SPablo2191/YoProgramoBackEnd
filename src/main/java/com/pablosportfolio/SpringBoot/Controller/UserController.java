/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pablosportfolio.SpringBoot.Controller;

import com.pablosportfolio.SpringBoot.model.User;
import com.pablosportfolio.SpringBoot.service.IUserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author pablo
 */
@RestController
public class UserController {
    @Autowired
    private IUserService userServ;

     @GetMapping ("/user")
     @ResponseBody
     public List<User> getUsers(){
         return this.userServ.getUsers();
     }
     @PostMapping ("/user")
     public void addKnowledge(@RequestBody User user){
         this.userServ.addUser(user);
     }
}
