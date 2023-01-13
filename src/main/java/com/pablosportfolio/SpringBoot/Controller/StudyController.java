/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pablosportfolio.SpringBoot.Controller;

import com.pablosportfolio.SpringBoot.model.Study;
import com.pablosportfolio.SpringBoot.service.IStudyService;
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
public class StudyController {
    @Autowired
    private IStudyService studyServ;
    // Study
    @CrossOrigin("*")
    @GetMapping ("/study")
    @ResponseBody
     public List<Study> getStudy(){
         return this.studyServ.getStudies();
     }
    @CrossOrigin("*")
    @PostMapping ("/study")
     public List<Study> addStudy(@RequestBody Study study){
         this.studyServ.addStudy(study);
         return this.getStudy();
     }
    @CrossOrigin("*")
    @DeleteMapping  ("/study/{id}") 
    @ResponseBody
     public void delStudy(@PathVariable int id){
         this.studyServ.deleteStudy(id);
     }
}
