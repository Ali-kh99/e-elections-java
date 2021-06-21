/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.eelection.service.impl;

import com.example.eelection.bean.Candidat;
import com.example.eelection.bean.Vote;
import com.example.eelection.bean.Voter;
import com.example.eelection.rmiService.RmiVoterService;
import com.example.eelection.service.VoteService;
import com.example.eelection.service.VoterService;
import com.example.eelection.service.utils.DigitalSignature;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SignatureException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author mac
 */
@Service
public class VoteServiceImpl implements VoteService {

    @Autowired
    public VoterService voterService;

    public int vote(String voterId, String candidatId) {
        try {
            Voter voter = voterService.findVoterById(voterId);
            byte[] signature = DigitalSignature.signMessage(voter.getKeyPair().getPrivate(), candidatId);
            RmiVoterService rmiVoterService = (RmiVoterService) Naming.lookup("rmi://localhost/voter");
            Vote vote = new Vote();
            Candidat candidat = new Candidat();
            candidat.setIdCnadidat(candidatId);
            vote.setCandidat(candidat);
            vote.setSignature(signature);
            vote.setVoteId(voterId + candidatId);
            vote.setMessage(candidatId);
            rmiVoterService.vote(vote);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(VoteServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchProviderException ex) {
            Logger.getLogger(VoteServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SignatureException ex) {
            Logger.getLogger(VoteServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvalidKeyException ex) {
            Logger.getLogger(VoteServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NotBoundException ex) {
            Logger.getLogger(VoteServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(VoteServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(VoteServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

}
