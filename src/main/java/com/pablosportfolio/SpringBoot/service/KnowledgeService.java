/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pablosportfolio.SpringBoot.service;

import com.pablosportfolio.SpringBoot.model.Knowledge;
import com.pablosportfolio.SpringBoot.repository.KnowledgeRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author pablo
 */
@Service
public class KnowledgeService implements IKnowledgeService {
    @Autowired
    public KnowledgeRepository knowledgeRepo;
    @Override
    public List<Knowledge> getKnowledges() {
        return this.knowledgeRepo.findAll();
    }

    @Override
    public void addKnowledge(Knowledge knowledge) {
        this.knowledgeRepo.save(knowledge);
    }

    @Override
    public void deleteKnowledge(int idKnowledge) {
        this.knowledgeRepo.deleteById(idKnowledge);
    }

    @Override
    public Knowledge getKnowledge(int idKnowledge) {
        return this.knowledgeRepo.findById(idKnowledge).orElse(null);
    }
    
}
