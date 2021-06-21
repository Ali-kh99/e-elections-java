/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.eelection.service.Impl;

import com.example.eelection.Database.Database;
import com.example.eelection.bean.Party;
import com.example.eelection.bean.Voter;
import com.example.eelection.service.PartyService;
import java.util.ArrayList;
import org.springframework.stereotype.Service;

/**
 *
 * @author mac
 */

@Service
public class PartyServiceImpl implements PartyService {
    
    
    @Override
    public void save(Party party) {
        Database.parties.add(party);
    }
    
    @Override
    public ArrayList<Party> findAll(){
        return Database.parties;
    }
    
    @Override
    public Party findById(String id){
       ArrayList<Party> parties = Database.parties;
        for (Party party : parties) {
            if (party.getId().equals(id)) {
                return party;
            }
        }
        return null;
    }
    
    @Override
    public Party findByName(String name){
       ArrayList<Party> parties = Database.parties;
        for (Party party : parties) {
            if (party.getName().equals(name)) {
                return party;
            }
        }
        return null;
    }
    
    public int findPartyIndexById(String id)  {
        ArrayList<Party> parties = Database.parties;
        int i = 0;
        for (Party party : parties) {
            if (party.getId().equals(id)) {
                return i;
            }
            i++;
        }
        return -1;
    }
    
    
}
