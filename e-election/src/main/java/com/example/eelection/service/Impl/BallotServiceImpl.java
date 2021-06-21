/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.eelection.service.Impl;

import com.example.eelection.Database.Database;
import com.example.eelection.bean.Ballot;
import com.example.eelection.service.BallotService;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author mac
 */
@Service
public class BallotServiceImpl implements BallotService {
    
    @Override
    public void save(Ballot ballot) {
        Database.ballots.add(ballot);
    }
    
    public ArrayList<Ballot> findAll(){
        return Database.ballots;
    }
    
    public Ballot findById(String id){
        ArrayList<Ballot> ballots = Database.ballots;
        for (Ballot ballot : ballots) {
            if (ballot.getBallotId().equals(id)) {
                return ballot;
            }
        }
        return null;
    }
    
    public int findBallotIndexById(String id)  {
        ArrayList<Ballot> ballots = Database.ballots;
        int i = 0;
        for (Ballot ballot : ballots) {
            if (ballot.getBallotId().equals(id)) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
