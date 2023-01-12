/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.pablosportfolio.SpringBoot.repository;

import com.pablosportfolio.SpringBoot.model.User;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author pablo
 */
public interface UserRepository extends  JpaRepository <User, Integer> {
    public List<User> findByuserName(String userName);
}
