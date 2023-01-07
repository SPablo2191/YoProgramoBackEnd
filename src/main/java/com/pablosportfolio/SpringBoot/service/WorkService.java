/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pablosportfolio.SpringBoot.service;

import com.pablosportfolio.SpringBoot.model.Work;
import com.pablosportfolio.SpringBoot.repository.WorkRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author pablo
 */
@Service
public class WorkService implements IWorkService {
    @Autowired
    public WorkRepository workRepo;
    @Override
    public List<Work> getWorks() {
        return this.workRepo.findAll();
    }

    @Override
    public void addWork(Work work) {
        this.workRepo.save(work);
    }

    @Override
    public void deleteWork(int idWork) {
        this.workRepo.deleteById(idWork);
    }

    @Override
    public Work getWork(int idWork) {
        return this.workRepo.findById(idWork).orElse(null);
    }
    
}
