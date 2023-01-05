/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.pablosportfolio.SpringBoot.service;

import com.pablosportfolio.SpringBoot.model.Knowledge;
import java.util.List;

/**
 *
 * @author pablo
 */
public interface IKnowledgeService {
    public List<Knowledge> getKnowledges();
    public void addKnowledge(Knowledge knowledge);
    public void deleteKnowledge(int idKnowledge);
    public Knowledge getKnowledge(int idKnowledge);
}
