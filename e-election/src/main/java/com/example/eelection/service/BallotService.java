/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.eelection.service;

import com.example.eelection.bean.Ballot;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author mac
 */
public interface BallotService extends Remote {
    public void save(Ballot ballot);
}
