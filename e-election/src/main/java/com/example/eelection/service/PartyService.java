/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.eelection.service;

import com.example.eelection.bean.Party;
import java.util.ArrayList;

/**
 *
 * @author mac
 */
public interface PartyService {
    
   public void save(Party party);
   
   public ArrayList<Party> findAll();
    
    public Party findById(String id);
    
    public Party findByName(String name);
}
