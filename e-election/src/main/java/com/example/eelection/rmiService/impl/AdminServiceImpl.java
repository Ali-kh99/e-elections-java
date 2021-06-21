/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.eelection.rmiService.impl;

import com.example.eelection.bean.Area;
import com.example.eelection.bean.Candidat;
import com.example.eelection.bean.Election;
import com.example.eelection.bean.Party;
import com.example.eelection.bean.Voter;
import com.example.eelection.rmiService.AdminService;
import com.example.eelection.service.Impl.AreaServiceImpl;
import com.example.eelection.service.Impl.CandidatServiceImpl;
import com.example.eelection.service.Impl.ElectionServiceImpl;
import com.example.eelection.service.Impl.VoterServiceImpl;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

/**
 *
 * @author mac
 */
public class AdminServiceImpl extends UnicastRemoteObject implements AdminService{
   
    VoterServiceImpl voterService;
    
    ElectionServiceImpl electionService;
    
    CandidatServiceImpl candidatService;
    
    AreaServiceImpl areaService;
    
    public AdminServiceImpl() throws RemoteException{
        super();
        voterService = new VoterServiceImpl();
        electionService = new ElectionServiceImpl();
        candidatService = new CandidatServiceImpl();
        areaService = new AreaServiceImpl();
    }

    @Override
    public ArrayList<Voter> findAllVoters() {
        return voterService.findAll();
    }

    @Override
    public ArrayList<Voter> findAllUnautorizedVoters() {
        return voterService.findAllUnautorizedVoters();
    }

    @Override
    public ArrayList<Voter> findAllRejectedVoters() {
        return voterService.findAllRejectedVoters();
    }

    @Override
    public Voter findVoterById(String id) {
        return voterService.findVoterById(id);
    }

    @Override
    public int autorizeVoter(String voterId) {
        return voterService.autorizeVoter(voterId);
    }

    @Override
    public int rejectVoter(String voterId) {
        return voterService.rejectVoter(voterId);
    }

//    @Override
//    public int unrejectVoter(String voterId) {
//        return voterService.unrejectVoter(voterId);
//    }
//
//    @Override
//    public int unautorizeVoter(String voterId) {
//        return voterService.unautorizeVoter(voterId);
//    }
    
    
    // Election

    @Override
    public int createElection(Election election) throws RemoteException {
        return electionService.save(election);
    }

    @Override
    public int startElection() throws RemoteException {
        return electionService.startElection();
    }

    @Override
    public int stopElection() throws RemoteException {
        return electionService.stopElection();
    }
    
    // Candidat
    
    @Override
    public void createCandidat(Candidat candidat) throws RemoteException {
        candidatService.save(candidat);
    }
    
    // Election

    @Override
    public Candidat getWinnerByArea(String areaId) throws RemoteException {
        return candidatService.getWinnerByArea(areaId);
    }

    @Override
    public Candidat getWinnerNational() throws RemoteException {
        return candidatService.getWinner();
    }

    @Override
    public void createArea(Area area) throws RemoteException {
        areaService.save(area);
    }

    @Override
    public int createParty(Party party) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
