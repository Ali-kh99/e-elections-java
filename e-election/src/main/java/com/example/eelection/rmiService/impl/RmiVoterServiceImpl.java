/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.eelection.rmiService.impl;

import com.example.eelection.bean.Area;
import com.example.eelection.bean.Candidat;
import com.example.eelection.bean.Vote;
import com.example.eelection.bean.Voter;
import com.example.eelection.rmiService.RmiVoterService;
import com.example.eelection.service.Impl.CandidatServiceImpl;
import com.example.eelection.service.Impl.VoteServiceImpl;
import com.example.eelection.service.Impl.VoterServiceImpl;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

/**
 *
 * @author Ali
 */
public class RmiVoterServiceImpl extends UnicastRemoteObject implements RmiVoterService{
    
    VoterServiceImpl voterService;
    
    CandidatServiceImpl candidatService;
    
    VoteServiceImpl voteService;
    
    public RmiVoterServiceImpl() throws RemoteException{
        super();
        voterService = new VoterServiceImpl();
        candidatService = new CandidatServiceImpl();
        voteService = new VoteServiceImpl();
    }

    @Override
    public void saveVoter(Voter voter) throws RemoteException {
       voterService.save(voter);
    }

    @Override
    public ArrayList<Candidat> findAllCandidats() throws RemoteException {
        return candidatService.findAll();
    }

    @Override
    public ArrayList<Candidat> findCandidatsByAreaId(String areaId) throws RemoteException {
        return candidatService.findCandidatsByAreaId(areaId);
    }

    @Override
    public int vote(Vote vote) throws RemoteException {
        return voteService.vote(vote);
    }

    @Override
    public ArrayList<Candidat> findCandidatsByVoterId(String voterId) throws RemoteException{
        return candidatService.findCandidatsByVoterId(voterId);
    }

    
}
