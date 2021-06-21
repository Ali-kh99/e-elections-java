/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.eelection.service;

import com.example.eelection.bean.Election;

/**
 *
 * @author mac
 */
public interface ElectionService {
    
    public int save(Election election);
    
    public int startElection();
    
    public int stopElection();
}
