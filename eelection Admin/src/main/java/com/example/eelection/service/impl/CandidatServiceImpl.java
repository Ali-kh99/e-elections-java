/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.eelection.service.impl;

import com.example.eelection.bean.Area;
import com.example.eelection.bean.Candidat;
import com.example.eelection.rmiService.AdminService;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.stereotype.Service;
import com.example.eelection.service.CandidatService;

/**
 *
 * @author mac
 */
@Service
public class CandidatServiceImpl implements CandidatService {

    @Override
    public String createCandidat(Candidat candidat) {
        try {
            AdminService adminService = (AdminService) Naming.lookup("rmi://localhost/admin");

            adminService.createCandidat(candidat);

            return "Candidat created Seccessfully";
        } catch (NotBoundException ex) {
            Logger.getLogger(CandidatServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(CandidatServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(CandidatServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "Cannot created candidat";
    }

    @Override
    public Candidat getWinnerByArea(String areaId) {
        try {
            AdminService adminService = (AdminService) Naming.lookup("rmi://localhost/admin");

            return adminService.getWinnerByArea(areaId);
        } catch (NotBoundException ex) {
            Logger.getLogger(CandidatServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(CandidatServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(CandidatServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public Candidat getWinnerNational() {
        try {
            AdminService adminService = (AdminService) Naming.lookup("rmi://localhost/admin");

            return adminService.getWinnerNational();
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
