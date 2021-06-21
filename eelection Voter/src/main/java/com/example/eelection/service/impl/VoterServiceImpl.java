/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.eelection.service.impl;

import com.example.eelection.Database.Database;
import com.example.eelection.bean.Area;
import com.example.eelection.bean.Candidat;
import com.example.eelection.bean.Voter;
import com.example.eelection.rmiService.RmiVoterService;
import com.example.eelection.service.VoterService;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.security.KeyPair;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.stereotype.Service;

/**
 *
 * @author mac
 */
@Service
public class VoterServiceImpl implements VoterService{

    @Override
    public void save(Voter voter){
        try {
            RmiVoterService rmiVoterService = (RmiVoterService) Naming.lookup("rmi://localhost/voter");
            Voter localVoter = new Voter();
            localVoter.setArea(voter.getArea());
            localVoter.setCin(voter.getCin());
            localVoter.setEmail(voter.getEmail());
            localVoter.setFirstName(voter.getFirstName());
            localVoter.setSecondName(voter.getSecondName());
            localVoter.setVoterId(voter.getVoterId());
            Database.voters.add(localVoter);
            
            voter.setKeyPair(new KeyPair(localVoter.getKeyPair().getPublic(), null));
            
            rmiVoterService.saveVoter(voter);
        } catch (RemoteException ex) {
            Logger.getLogger(VoterServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NotBoundException ex) {
            Logger.getLogger(VoterServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(VoterServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public Voter findVoterById(String id)  {
        ArrayList<Voter> voters = Database.voters;
        for (Voter voter : voters) {
            if (voter.getVoterId().equals(id)) {
                return voter;
            }
        }
        return null;
    }

//    @Override
//    public ArrayList<Candidat> findAllCandidats() {
//        try {
//            RmiVoterService rmiVoterService = (RmiVoterService) Naming.lookup("rmi://localhost/voter");
//            return rmiVoterService.findAllCandidats();
//        } catch (NotBoundException ex) {
//            Logger.getLogger(VoterServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (MalformedURLException ex) {
//            Logger.getLogger(VoterServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (RemoteException ex) {
//            Logger.getLogger(VoterServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return null;
//    }
//
//    @Override
//    public ArrayList<Candidat> findCandidatsByArea(Area area) {
//        try {
//            RmiVoterService rmiVoterService = (RmiVoterService) Naming.lookup("rmi://localhost/voter");
//            return rmiVoterService.findCandidatsByArea(area);
//        } catch (NotBoundException ex) {
//            Logger.getLogger(VoterServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (MalformedURLException ex) {
//            Logger.getLogger(VoterServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (RemoteException ex) {
//            Logger.getLogger(VoterServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return null;
//    }
}
