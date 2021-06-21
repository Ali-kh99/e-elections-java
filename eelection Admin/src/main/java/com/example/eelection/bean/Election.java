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
public class Election implements Serializable {
    
    private String electionId;
    
    private String name;
    
    private Integer year;
    
    private Boolean started;
    
    private Boolean stoped;
    
//    private Date startDate;
//    
//    private Date endDate;
    
    private String type;

    public String getElectionId() {
        return electionId;
    }

    public void setElectionId(String electionId) {
        this.electionId = electionId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

//    public Date getStartDate() {
//        return startDate;
//    }
//
//    public void setStartDate(Date startDate) {
//        this.startDate = startDate;
//    }
//
//    public Date getEndDate() {
//        return endDate;
//    }
//
//    public void setEndDate(Date endDate) {
//        this.endDate = endDate;
//    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getStarted() {
        return started;
    }

    public void setStarted(Boolean started) {
        this.started = started;
    }

    public Boolean getStoped() {
        return stoped;
    }

    public void setStoped(Boolean stoped) {
        this.stoped = stoped;
    }
    
    
    
}
