/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.eelection.bean;

import java.io.Serializable;
import java.security.KeyPair;
/**
 *
 * @author mac
 */
public class Voter implements Serializable {
    
    public String voterId;
    
    public static final long serialVersionUID = 42L;

    private String fullName;
    
    // Just Public Key, Private key = null
    private KeyPair keyPair;
   
    private String firstName;
   
    private String secondName;
   
    private String cin;
    
    private Area area;
    
    private Boolean authorized;
   
    private Boolean rejected;
   
    private Boolean voted;
   
    private Ballot ballot;
   
    private String email;

    public String getFullName() {
            return fullName;
    }

    public void setFullName(String fullName) {
            this.fullName = fullName;
    }

    public KeyPair getKeyPair() {
            return keyPair;
    }

    public void setKeyPair(KeyPair keyPair) {
            this.keyPair = keyPair;
    }

    public String getVoterId() {
        return voterId;
    }

    public void setVoterId(String voterId) {
        this.voterId = voterId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }


    public Boolean getVoted() {
        return voted;
    }

    public void setVoted(Boolean voted) {
        this.voted = voted;
    }

    public Ballot getBallot() {
        return ballot;
    }

    public void setBallot(Ballot ballot) {
        this.ballot = ballot;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getAuthorized() {
        return authorized;
    }

    public void setAuthorized(Boolean authorized) {
        this.authorized = authorized;
    }

    public Boolean getRejected() {
        return rejected;
    }

    public void setRejected(Boolean rejected) {
        this.rejected = rejected;
    }

    @Override
    public String toString() {
        return "Voter{" + "voterId=" + voterId + ", fullName=" + fullName + ", keyPair=" + keyPair + ", firstName=" + firstName + ", secondName=" + secondName + ", cin=" + cin + ", area=" + area + ", authorized=" + authorized + ", rejected=" + rejected + ", voted=" + voted + ", ballot=" + ballot + ", email=" + email + '}';
    }
    
}
