/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.eelection.bean;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author mac
 */
@Entity
public class Ballot implements Serializable{
    
    @Id
    private String ballotId;
    
    private boolean ballotCast;
    
    @Column(name="`type`")
    private String type;
    
    @ManyToOne
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
