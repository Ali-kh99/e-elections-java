/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.eelection.service;

import com.example.eelection.bean.Area;
import com.example.eelection.bean.Candidat;
import java.util.ArrayList;


/**
 *
 * @author mac
 */

public interface CandidatService {
    
    public ArrayList<Candidat> findAllCandidats();
    
//    public ArrayList<Candidat> findCandidatsByArea(Area area);
    
    public ArrayList<Candidat> findCandidatsByVoterId(String voterId);
}
