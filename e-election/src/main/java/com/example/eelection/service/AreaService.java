/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.eelection.service;

import com.example.eelection.bean.Area;
import com.example.eelection.bean.Candidat;
import com.example.eelection.bean.Vote;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 *
 * @author mac
 */
public interface AreaService extends Remote {
    public void save(Area area) throws RemoteException;   
}
