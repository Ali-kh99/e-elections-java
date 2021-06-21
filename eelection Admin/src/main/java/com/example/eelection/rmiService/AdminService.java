/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.eelection.rmiService;

import com.example.eelection.bean.Area;
import com.example.eelection.bean.Candidat;
import com.example.eelection.bean.Election;
import com.example.eelection.bean.Party;
import com.example.eelection.bean.Voter;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 *
 * @author mac
 */
public interface AdminService extends Remote{
    
    // Voters
    public ArrayList<Voter> findAllVoters() throws RemoteException;
    
    public ArrayList<Voter> findAllUnautorizedVoters() throws RemoteException;
    
    public ArrayList<Voter> findAllRejectedVoters() throws RemoteException;
    
    public Voter findVoterById(String id) throws RemoteException;
    
    public int autorizeVoter(String voterId) throws RemoteException;
    
    public int rejectVoter(String voterId) throws RemoteException;
    
    public int unrejectVoter(String voterId) throws RemoteException;
    
    public int unautorizeVoter(String voterId) throws RemoteException;
    
    // Election :
    
    public int createElection(Election election) throws RemoteException;
    
    public int startElection() throws RemoteException;
    
    public int stopElection() throws RemoteException;
    
    // Cnadidats
        
    public void createCandidat(Candidat candidat) throws RemoteException;
    
    // Results
    
    public Candidat getWinnerByArea(String areaId) throws RemoteException;
    
    public Candidat getWinnerNational() throws RemoteException;
    
    // Area
    
    public void createArea(Area area) throws RemoteException;
    
    // Party
    
    public int createParty(Party party) throws RemoteException;
    
}
