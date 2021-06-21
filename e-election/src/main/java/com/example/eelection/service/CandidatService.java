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
    
    public void save(Candidat candidat);
    
    public int countVotes(String Id);
    
    public Candidat getWinnerByArea(String areaId);
    
    public Candidat getWinner();

    public ArrayList<Candidat> findAll();

    public Candidat findById(long id);
    
    public ArrayList<Candidat> findCandidatsByAreaId(String areaId);
    
    public int vote(Candidat candidat);
}
