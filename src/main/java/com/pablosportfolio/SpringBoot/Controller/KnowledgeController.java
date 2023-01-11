/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pablosportfolio.SpringBoot.Controller;

import com.pablosportfolio.SpringBoot.model.Knowledge;
import com.pablosportfolio.SpringBoot.service.IKnowledgeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
    @CrossOrigin("*")
    @GetMapping ("/knowledge") 
    @ResponseBody
     public List<Knowledge> getKnowledges(){
         return this.knowledgeServ.getKnowledges();
     }
//    @CrossOrigin("*")
//    @GetMapping ("/knowledge/{id}") 
//    @ResponseBody
//     public Knowledge getKnowledge(@PathVariable int id){
//         return this.knowledgeServ.getKnowledge(id);
//     }
     @CrossOrigin("*")
     @PostMapping ("/knowledge")
     public HttpStatus addKnowledge(@RequestBody Knowledge knowledge){
         this.knowledgeServ.addKnowledge(knowledge);
         return HttpStatus.OK;
     }
    @CrossOrigin("*")
    @DeleteMapping  ("/knowledge/{id}") 
    @ResponseBody
     public void delKnowledge(@PathVariable int id){
         this.knowledgeServ.deleteKnowledge(id);
     }
     
}
