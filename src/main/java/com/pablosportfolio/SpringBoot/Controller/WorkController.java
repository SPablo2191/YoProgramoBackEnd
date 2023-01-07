/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pablosportfolio.SpringBoot.Controller;

import com.pablosportfolio.SpringBoot.model.Work;
import com.pablosportfolio.SpringBoot.service.IWorkService;
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
public class WorkController {
    @Autowired
    private IWorkService workServ;
    @GetMapping ("/work")
    @ResponseBody
     public List<Work> getWork(){
         return this.workServ.getWorks();
    } 
    @PostMapping ("/work")
    public void addWork(@RequestBody Work work){
        this.workServ.addWork(work);
    }
}
