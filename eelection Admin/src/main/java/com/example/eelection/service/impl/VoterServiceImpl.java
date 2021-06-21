/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.eelection.service.impl;

import com.example.eelection.bean.Voter;
import com.example.eelection.rmiService.AdminService;
import com.example.eelection.service.VoterService;
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
public class VoterServiceImpl implements VoterService{

    @Override
    public ArrayList<Voter> findAll() {
        try {
            AdminService adminService = (AdminService) Naming.lookup("rmi://localhost/admin");
            
            ArrayList<Voter>  voters = adminService.findAllVoters();
            System.out.println(voters);
            
            return voters;
        } catch (NotBoundException ex) {
            Logger.getLogger(VoterServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(VoterServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(VoterServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }

    @Override
    public int autorizeVoter(String voterId) {
        try {
            AdminService adminService = (AdminService) Naming.lookup("rmi://localhost/admin");
            
            return adminService.autorizeVoter(voterId);
            
        } catch (NotBoundException ex) {
            Logger.getLogger(VoterServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(VoterServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(VoterServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return 0;
    }

    @Override
    public int rejectVoter(String voterId) {
        try {
            AdminService adminService = (AdminService) Naming.lookup("rmi://localhost/admin");
            
            return adminService.rejectVoter(voterId);
            
        } catch (NotBoundException ex) {
            Logger.getLogger(VoterServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(VoterServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(VoterServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return 0;
    }

//    @Override
//    public void unautorizeVoter(Voter voter) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public void unrejectVoter(Voter voter) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    @Override
    public ArrayList<Voter> findAllUnautorizedVoters() {
        try {
            AdminService adminService = (AdminService) Naming.lookup("rmi://localhost/admin");
            
            ArrayList<Voter>  unautorizedVoters = adminService.findAllUnautorizedVoters();
            System.out.println(unautorizedVoters);
            
            return unautorizedVoters;
        } catch (NotBoundException ex) {
            Logger.getLogger(VoterServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(VoterServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(VoterServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }
    
}
