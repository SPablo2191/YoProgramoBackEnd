/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.pablosportfolio.SpringBoot.service;

import com.pablosportfolio.SpringBoot.model.User;
import java.util.List;

/**
 *
 * @author pablo
 */
public interface IUserService {
    public List<User> getUsers();
    public void addUser(User user);
    public void deleteUser(int idUser);
    public User getUser(int idUser);
}
