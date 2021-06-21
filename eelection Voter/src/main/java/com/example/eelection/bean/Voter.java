/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.eelection.bean;

import com.example.eelection.service.utils.DigitalSignature;
import java.io.Serializable;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.stereotype.Component;

/**
 *
 * @author mac
 */
@Component
public class Voter implements Serializable {

    public static final long serialVersionUID = 42L;

    public String voterId;

    private KeyPair keyPair;

    public String firstName;

    public String secondName;

    public String cin;

//    public String carteIdRecto;
//   
//    public String carteIdVerso;
    
    public Area area;

//    public Boolean authorized;
//   
//    public Boolean rejected;
    
    public Boolean voted;

    public Ballot ballot;

    public String email;

    public Voter() {
        try {
            this.keyPair = DigitalSignature.generateKeyPair();
            this.voted = Boolean.FALSE;
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(Voter.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchProviderException ex) {
            Logger.getLogger(Voter.class.getName()).log(Level.SEVERE, null, ex);
        }
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

    @Override
    public String toString() {
        return "Voter{" + "voterId=" + voterId + ", keyPair=" + keyPair + ", firstName=" + firstName + ", secondName=" + secondName + ", cin=" + cin + ", area=" + area + ", voted=" + voted + ", ballot=" + ballot + ", email=" + email + '}';
    }

}
