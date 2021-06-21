/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.eelection.service;

import com.example.eelection.bean.Vote;

/**
 *
 * @author mac
 */
public interface VoteService {
    
    public int vote(Vote vote);
     
    public void save(Vote vote);
    
    public Long countTotalVotes();
    
}
