/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.eelection.rmiService;

import com.example.eelection.bean.Area;
import com.example.eelection.bean.Candidat;
import com.example.eelection.bean.Vote;
import com.example.eelection.bean.Voter;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 *
 * @author mac
 */
public interface RmiVoterService extends Remote {
    
    public void saveVoter(Voter voter) throws RemoteException;
    
    public ArrayList<Candidat> findAllCandidats() throws RemoteException;
    
    public ArrayList<Candidat> findCandidatsByAreaId(String areaId) throws RemoteException;
    
    public int vote(Vote vote) throws RemoteException;
    
    public ArrayList<Candidat> findCandidatsByVoterId(String voterId) throws RemoteException;

}
