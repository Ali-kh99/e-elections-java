/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.eelection.bean;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author mac
 */
@Entity
public class Candidat implements Serializable {

    @Id
    private String idCnadidat;

    public static final long serialVersionUID = 41L;

    private int count;

    private String nomSGP;

    private String prenomSGP;

    @ManyToOne
    private Area area;

    @ManyToOne
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
