/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.eelection.service;

import com.example.eelection.bean.Voter;
import java.util.ArrayList;

/**
 *
 * @author mac
 */
public interface VoterService {
    
    public ArrayList<Voter> findAll();
    
    public int autorizeVoter(String voterId);
    
    public int rejectVoter(String voterId);
    
//    public void unautorizeVoter(Voter voter);
//    
//    public void unrejectVoter(Voter voter);
    
    public ArrayList<Voter> findAllUnautorizedVoters();
    
}
