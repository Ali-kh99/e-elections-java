/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.eelection.bean;

import java.io.Serializable;

/**
 *
 * @author mac
 */

public class Ballot implements Serializable{
    
    private String ballotId;
    
    private boolean ballotCast;
    
    private String type;
    
    private Election election;

    public String getBallotId() {
        return ballotId;
    }

    public void setBallotId(String ballotId) {
        this.ballotId = ballotId;
    }

    public boolean isBallotCast() {
        return ballotCast;
    }

    public void setBallotCast(boolean ballotCast) {
        this.ballotCast = ballotCast;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Election getElection() {
        return election;
    }

    public void setElection(Election election) {
        this.election = election;
    }
    
    
}
