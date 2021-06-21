/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.eelection.bean;

import java.io.Serializable;
import org.springframework.stereotype.Component;

/**
 *
 * @author mac
 */
@Component
public class Party implements Serializable {
    
    private String id;

    private String name;
    
    // Le nom du symbole
    private String symbole;
    
    // L'image du symbole
    private String symboleIcon;
    
    // id du candidat qui est le secretaire General du Parti
    
    private Candidat secretaireGeneral;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbole() {
        return symbole;
    }

    public void setSymbole(String symbole) {
        this.symbole = symbole;
    }

    public String getSymboleIcon() {
        return symboleIcon;
    }

    public void setSymboleIcon(String symboleIcon) {
        this.symboleIcon = symboleIcon;
    }

    public Candidat getSecretaireGeneral() {
        return secretaireGeneral;
    }

    public void setSecretaireGeneral(Candidat secretaireGeneral) {
        this.secretaireGeneral = secretaireGeneral;
    }

    
    
}
