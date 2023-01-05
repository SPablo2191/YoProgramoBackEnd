/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pablosportfolio.SpringBoot.service;

import com.pablosportfolio.SpringBoot.model.User;
import com.pablosportfolio.SpringBoot.repository.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author pablo
 */
@Service
public class UserService implements IUserService {
    @Autowired
    public UserRepository userRepo;
    @Override
    public List<User> getUsers() {
        return userRepo.findAll();
    }

    @Override
    public void addUser(User user) {
        userRepo.save(user);
    }

    @Override
    public void deleteUser(int idUser) {
        userRepo.deleteById(idUser);
    }

    @Override
    public User getUser(int idUser) {
        return this.userRepo.findById(idUser).orElse(null);
    }
    
}
