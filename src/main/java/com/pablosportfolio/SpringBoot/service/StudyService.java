/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pablosportfolio.SpringBoot.service;

import com.pablosportfolio.SpringBoot.model.Study;
import com.pablosportfolio.SpringBoot.repository.StudyRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author pablo
 */
public class StudyService implements IStudyService {
    @Autowired
    public StudyRepository studyRepo; 
    @Override
    public List<Study> getStudies() {
        return this.studyRepo.findAll();
    }

    @Override
    public void addStudy(Study study) {
        this.studyRepo.save(study);
    }

    @Override
    public void deleteStudy(int idStudy) {
        this.studyRepo.deleteById(idStudy);
    }

    @Override
    public Study getStudy(int idStudy) {
        return this.studyRepo.findById(idStudy).orElse(null);
    }
    
}
