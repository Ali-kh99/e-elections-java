/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.eelection.service.Impl;

import com.example.eelection.Database.Database;
import com.example.eelection.bean.Vote;
import com.example.eelection.service.VoteService;
import com.example.eelection.service.utils.DigitalSignature;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PublicKey;
import java.security.SignatureException;
import java.util.ArrayList;
import org.springframework.stereotype.Service;

/**
 *
 * @author mac
 */
@Service
public class VoteServiceImpl implements VoteService {

    @Override
    public void save(Vote vote) {
        Database.votes.add(vote);
    }

    public ArrayList<Vote> findAll() {
        return Database.votes;
    }

    public Vote findVoteById(String id) {
        ArrayList<Vote> votes = Database.votes;
        for (Vote vote : votes) {
            if (vote.getVoteId().equals(id)) {
                return vote;
            }
        }
        return null;
    }
    
    public boolean verifyVote(PublicKey pk){
        ArrayList<Vote> votes = Database.votes;
        
        for (Vote vote : votes) {
            if (vote.getPublicKey() == pk) {
                return true;
            }
        }
        return false;
    }

    public int vote(Vote vote) {
        try {
            boolean val = DigitalSignature.verify(vote.getPublicKey(), vote.getMessage(), vote.getSignature());
            if (!val) {
                System.out.println("com.example.eelection.service.Impl.VoteServiceImpl.vote() : " + -1);
                return -1;
            }

            boolean voted = verifyVote(vote.getPublicKey());

            if (voted) {
                System.out.println("com.example.eelection.service.Impl.VoteServiceImpl.vote() : " + -2);
                return -2;
            }
            Database.votes.add(vote);

            Database.candidats.forEach(c -> {
                if (c.getIdCnadidat() == vote.getCandidat().getIdCnadidat()) {
                    c.setCount(c.getCount() + 1);
                }
            });
            System.out.println("com.example.eelection.service.Impl.VoteServiceImpl.vote() : " + 1);
            return 1;

        } catch (InvalidKeyException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (NoSuchProviderException e) {
            e.printStackTrace();
        } catch (SignatureException e) {
            e.printStackTrace();
        }
        System.out.println("com.example.eelection.service.Impl.VoteServiceImpl.vote() : " + -3);
        return -3;
    }

    @Override
    public Long countTotalVotes() {
        if (Database.election != null) {

        }
        return null;
    }

    public int findPartyIndexById(String id) {
        ArrayList<Vote> votes = Database.votes;
        int i = 0;
        for (Vote vote : votes) {
            if (vote.getVoteId().equals(id)) {
                return i;
            }
            i++;
        }
        return -1;
    }

}
