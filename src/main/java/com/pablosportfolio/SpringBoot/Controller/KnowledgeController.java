/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pablosportfolio.SpringBoot.Controller;

import com.pablosportfolio.SpringBoot.model.Knowledge;
import com.pablosportfolio.SpringBoot.service.IKnowledgeService;
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
public class KnowledgeController {
    @Autowired
    private IKnowledgeService knowledgeServ;

    @GetMapping ("/knowledge")
    @ResponseBody
     public List<Knowledge> getKnowledge(){
         return this.knowledgeServ.getKnowledges();
     }
     @PostMapping ("/knowledge")
     public void addKnowledge(@RequestBody Knowledge knowledge){
         this.knowledgeServ.addKnowledge(knowledge);
     }
     
}