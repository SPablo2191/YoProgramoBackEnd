/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pablosportfolio.SpringBoot.Controller;

import com.pablosportfolio.SpringBoot.model.Work;
import com.pablosportfolio.SpringBoot.service.IWorkService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
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
public class WorkController {
    @Autowired
    private IWorkService workServ;
    
    @CrossOrigin("*")
    @GetMapping ("/work")
    @ResponseBody
     public List<Work> getWork(){
         return this.workServ.getWorks();
    } 
    @CrossOrigin("*")
    @PostMapping ("/work")
    public List<Work> addWork(@RequestBody Work work){
        this.workServ.addWork(work);
        return this.getWork();
    }
    @CrossOrigin("*")
    @DeleteMapping  ("/work/{id}") 
    @ResponseBody
     public void delWork(@PathVariable int id){
         this.workServ.deleteWork(id);
     }
}
