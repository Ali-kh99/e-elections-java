/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.eelection.service.impl;

import com.example.eelection.bean.Area;
import com.example.eelection.bean.Candidat;
import com.example.eelection.rmiService.RmiVoterService;
import com.example.eelection.service.CandidatService;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.stereotype.Service;

/**
 *
 * @author mac
 */
@Service
public class CandidatServiceImpl implements CandidatService {
    
    

    @Override
    public ArrayList<Candidat> findAllCandidats() {
        try {
            RmiVoterService rmiVoterService = (RmiVoterService) Naming.lookup("rmi://localhost/voter");
            return rmiVoterService.findAllCandidats();
        } catch (NotBoundException ex) {
            Logger.getLogger(CandidatServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(CandidatServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(CandidatServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

//    @Override
//    public ArrayList<Candidat> findCandidatsByArea(Area area) {
//        try {
//            RmiVoterService rmiVoterService = (RmiVoterService) Naming.lookup("rmi://localhost/voter");
//            return rmiVoterService.findCandidatsByArea(area);
//        } catch (NotBoundException ex) {
//            Logger.getLogger(CandidatServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (MalformedURLException ex) {
//            Logger.getLogger(CandidatServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (RemoteException ex) {
//            Logger.getLogger(CandidatServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return null;
//    }

    @Override
    public ArrayList<Candidat> findCandidatsByVoterId(String voterId) {
        try {
            RmiVoterService rmiVoterService = (RmiVoterService) Naming.lookup("rmi://localhost/voter");
            return rmiVoterService.findCandidatsByVoterId(voterId);
        } catch (NotBoundException ex) {
            Logger.getLogger(CandidatServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(CandidatServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(CandidatServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    
}
