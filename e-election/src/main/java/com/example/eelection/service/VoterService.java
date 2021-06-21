/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.eelection.service;

import com.example.eelection.bean.Area;
import com.example.eelection.bean.Voter;
import java.util.ArrayList;

/**
 *
 * @author mac
 */
public interface VoterService{
    
    // Voter
    public void save(Voter voter);
    
    public ArrayList<Voter> findCandidatsByArea(Area area);
            
    // Admin
    public ArrayList<Voter> findAll();
    
    public ArrayList<Voter> findAllUnautorizedVoters();
    
    public ArrayList<Voter> findAllRejectedVoters();
    
    public Voter findVoterById(String id);
    
    public int autorizeVoter(String voterId);
    
    public int rejectVoter(String voterId);
    
//    public int unrejectVoter(String voterId);
//    
//    public int unautorizeVoter(String voterId);
    
    

}
