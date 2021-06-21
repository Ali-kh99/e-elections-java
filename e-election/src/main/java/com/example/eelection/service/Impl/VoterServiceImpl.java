/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.eelection.service.Impl;


import com.example.eelection.Database.Database;
import com.example.eelection.bean.Area;
import com.example.eelection.bean.Voter;
import com.example.eelection.service.VoterService;
import java.util.ArrayList;
import org.springframework.stereotype.Service;


/**
 *
 * @author mac
 */
@Service
public class VoterServiceImpl implements VoterService {
            
    @Override
    public void save(Voter voter) {
        System.out.println(voter.toString());
        System.out.println("Voter Public Key : " +voter.getKeyPair().getPublic());
        System.out.println("Voter Private Key : " +voter.getKeyPair().getPrivate());
        voter.setAuthorized(Boolean.FALSE);
        voter.setRejected(Boolean.FALSE);
        Database.voters.add(voter);   
    }

    @Override
    public ArrayList<Voter> findAll(){
        return Database.voters;
    }

    @Override
    public ArrayList<Voter> findAllUnautorizedVoters(){
    ArrayList<Voter> voters = Database.voters;
    ArrayList<Voter> unautorizedVoters = new ArrayList<>();
        for (Voter voter : voters) {
            if (voter.getAuthorized() == false) {
                unautorizedVoters.add(voter);
            }
        }
        return unautorizedVoters;
    }
    
    @Override
    public ArrayList<Voter> findAllRejectedVoters(){
    ArrayList<Voter> voters = Database.voters;
    ArrayList<Voter> rejectedVoters = new ArrayList<>();
    
        for (Voter voter : voters) {
            if (voter.getRejected()== true) {
                rejectedVoters.add(voter);
            }
        }
        return rejectedVoters;
    }

    @Override
    public Voter findVoterById(String id)  {
        ArrayList<Voter> voters = Database.voters;
        for (Voter voter : voters) {
            if (voter.getVoterId().equals(id)) {
                return voter;
            }
        }
        return null;
    }
    
    public int findVoterIndexById(String id) {
        ArrayList<Voter> voters = Database.voters;
        int i = 0;
        for (Voter voter : voters) {
            if (voter.getVoterId().equals(id)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override
    public int autorizeVoter(String voterId) {
        int voterIndex = findVoterIndexById(voterId);
        if(voterIndex == -1 ){
            return -1; 
        }else{
            Voter voter = Database.voters.get(voterIndex);
            voter.setAuthorized(Boolean.TRUE);
            Database.voters.set(voterIndex, voter);
            return 1;
        }
    }
    
     @Override
    public int rejectVoter(String voterId) {
        int voterIndex = findVoterIndexById(voterId);
        if(voterIndex == -1 ){
            return 0; 
        }else{
            Voter voter = Database.voters.get(voterIndex);
            voter.setRejected(Boolean.TRUE);
            Database.voters.set(voterIndex, voter);
            System.out.println("com.example.eelection.service.Impl.VoterServiceImpl.rejectVoter() Voter : " + voter);
            System.out.println("com.example.eelection.service.Impl.VoterServiceImpl.rejectVoter() Voters " + Database.voters);
            return 1;
        }     
    }
    
//    @Override
//    public int unautorizeVoter(String voterId) {
//        int voterIndex = findVoterIndexById(voter.getVoterId());
//        if(voterIndex == -1 ){
//            return 0; 
//        }else{
//            ArrayList<Voter> voters = Database.voters;
//            voter.setAuthorized(Boolean.FALSE);
//            voters.set(voterIndex, voter);                        
//            Database.voters = voters;
//            return 1;
//        }
//    }
//
//    @Override
//    public int unrejectVoter(String voterId) {
//        int voterIndex = findVoterIndexById(voter.getVoterId());
//        if(voterIndex == -1 ){
//            return 0; 
//        }else{
//            ArrayList<Voter> voters = Database.voters;
//            voter.setRejected(Boolean.FALSE);
//            voters.set(voterIndex, voter);
//            Database.voters = voters;
//            return 1;
//        }    
//    }
    
    @Override
    public ArrayList<Voter> findCandidatsByArea(Area area){
        ArrayList<Voter> voters = Database.voters;
        ArrayList<Voter> areaCandidats = new ArrayList<>();
        for (Voter voter : voters) {
            if (voter.getArea().equals(area)) {
                areaCandidats.add(voter);
            }
        }
        return  areaCandidats;
    }
}