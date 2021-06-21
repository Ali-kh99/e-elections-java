/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.eelection.service;

import com.example.eelection.bean.Candidat;

/**
 *
 * @author mac
 */
public interface CandidatService {
    
    public String createCandidat(Candidat candidat);

    public Candidat getWinnerByArea(String areaId);
    
    public Candidat getWinnerNational();
    
}
