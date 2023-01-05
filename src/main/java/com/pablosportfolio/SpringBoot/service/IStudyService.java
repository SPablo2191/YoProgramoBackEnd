/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.pablosportfolio.SpringBoot.service;

import com.pablosportfolio.SpringBoot.model.Study;
import java.util.List;

/**
 *
 * @author pablo
 */
public interface IStudyService {
    public List<Study> getStudies();
    public void addStudy(Study study);
    public void deleteStudy(int idStudy);
    public Study getStudy(int idStudy);
}
