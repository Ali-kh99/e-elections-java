/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.eelection.service.impl;

import com.example.eelection.bean.Area;
import com.example.eelection.rmiService.AdminService;
import com.example.eelection.service.AreaService;
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
public class AreaServiceImpl implements AreaService {

    @Override
    public void createArea(Area area) {
        try {
            AdminService adminService = (AdminService) Naming.lookup("rmi://localhost/admin");

            adminService.createArea(area);
        } catch (NotBoundException ex) {
            Logger.getLogger(CandidatServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(CandidatServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(CandidatServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
