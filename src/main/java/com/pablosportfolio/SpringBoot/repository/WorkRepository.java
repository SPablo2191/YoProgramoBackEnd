/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.pablosportfolio.SpringBoot.repository;


import com.pablosportfolio.SpringBoot.model.Work;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author pablo
 */
@Repository
public interface WorkRepository extends  JpaRepository <Work, Integer>{
    
}
