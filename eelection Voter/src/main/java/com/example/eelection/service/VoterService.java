/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.eelection.service;

import com.example.eelection.bean.Voter;
import org.springframework.stereotype.Component;

/**
 *
 * @author mac
 */
@Component
public interface VoterService {
    
    public void save(Voter voter);
    
    public Voter findVoterById(String id);
    
//    public ArrayList<Candidat> findAllCandidats();
//    
//    public ArrayList<Candidat> findCandidatsByArea(Area area);
    
}
