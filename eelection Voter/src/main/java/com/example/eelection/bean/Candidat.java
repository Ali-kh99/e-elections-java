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
public class Candidat implements Serializable {
    
    private String idCnadidat;
        
    private int count;
    
    public static final long serialVersionUID = 41L;
    
    private String description;
    
    private String nomSGP;
    
    private String prenomSGP;
        
    private Area area;

    private Party party;
     

    public Candidat() {
            this.count = 0;
    }

    public int getCount() {
            return count;
    }

    public void setCount(int count) {
            this.count = count;
    }

    public String getIdCnadidat() {
        return idCnadidat;
    }

    public void setIdCnadidat(String idCnadidat) {
        this.idCnadidat = idCnadidat;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNomSGP() {
        return nomSGP;
    }

    public void setNomSGP(String nomSGP) {
        this.nomSGP = nomSGP;
    }

    public String getPrenomSGP() {
        return prenomSGP;
    }

    public void setPrenomSGP(String prenomSGP) {
        this.prenomSGP = prenomSGP;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public Party getParty() {
        return party;
    }

    public void setParty(Party party) {
        this.party = party;
    }
    
}
