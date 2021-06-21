/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.eelection.service.impl;

import com.example.eelection.bean.Election;
import com.example.eelection.rmiService.AdminService;
import com.example.eelection.service.ElectionService;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.stereotype.Service;

/**
 *
 * @author mac
 */
@Service
public class ElectionServiceImpl implements ElectionService {

    @Override
    public int createElection(Election election) {
        try {
            AdminService adminService = (AdminService) Naming.lookup("rmi://localhost/admin");
            
            return adminService.createElection(election);
        } catch (NotBoundException ex) {
            Logger.getLogger(CandidatServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(CandidatServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(ElectionServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    @Override
    public int startElection() {
        try {
            AdminService adminService = (AdminService) Naming.lookup("rmi://localhost/admin");
            
            return adminService.startElection();
        } catch (NotBoundException ex) {
            Logger.getLogger(ElectionServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(ElectionServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(ElectionServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    @Override
    public int stopElection() {
        try {
            AdminService adminService = (AdminService) Naming.lookup("rmi://localhost/admin");
            
            return adminService.stopElection();
        } catch (NotBoundException ex) {
            Logger.getLogger(ElectionServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(ElectionServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(ElectionServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    
}
