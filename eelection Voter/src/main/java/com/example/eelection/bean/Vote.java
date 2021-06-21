/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.eelection.bean;

import java.io.Serializable;
import java.security.PublicKey;

/**
 *
 * @author mac
 */
public class Vote implements Serializable {
	
    private String voteId;
    
    private Candidat candidat;
        
    private byte[] signature;
    
    private PublicKey publicKey;
    
    private String message;

    public String getVoteId() {
        return voteId;
    }

    public void setVoteId(String voteId) {
        this.voteId = voteId;
    }

    public byte[] getSignature() {
            return signature;
    }

    public void setSignature(byte[] signature) {
            this.signature = signature;
    }

    public PublicKey getPublicKey() {
            return publicKey;
    }

    public void setPublicKey(PublicKey publicKey) {
            this.publicKey = publicKey;
    }

    public String getMessage() {
            return message;
    }

    public void setMessage(String message) {
            this.message = message;
    }

    public Candidat getCandidat() {
        return candidat;
    }

    public void setCandidat(Candidat candidat) {
        this.candidat = candidat;
    }
        

}