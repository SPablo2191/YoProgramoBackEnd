/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.pablosportfolio.SpringBoot.service;

import com.pablosportfolio.SpringBoot.model.Knowledge;
import com.pablosportfolio.SpringBoot.model.User;
import java.util.List;

/**
 *
 * @author pablo
 */
public interface IKnowledgeService {
    public List<User> getKnowledges();
    public void addKnowledge(Knowledge knowledge);
    public void deleteKnowledge(int idKnowledge);
    public User getKnowledge(int idKnowledge);
}
