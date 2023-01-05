/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.pablosportfolio.SpringBoot.service;

import com.pablosportfolio.SpringBoot.model.Work;
import java.util.List;

/**
 *
 * @author pablo
 */
public interface IWorkService {
    public List<Work> getWorks();
    public void addWork(Work work);
    public void deleteWork(int idWork);
    public Work getWork(int idWork);
}
