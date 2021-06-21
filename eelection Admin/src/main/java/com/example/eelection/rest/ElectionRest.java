/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.eelection.rest;

import com.example.eelection.bean.Election;
import com.example.eelection.service.ElectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author mac
 */
@RestController
@RequestMapping("/e-elections/admin/election")
public class ElectionRest {
    
    @Autowired
    public ElectionService electionService;
    
    @PostMapping("/")
    public int createElection(@RequestBody Election election){
        return electionService.createElection(election);
    } 
    
    @PostMapping("/start")
    public int startElection(){
        return electionService.startElection();
    }
    
    @PostMapping("/stop")
    public int stopElection(){
        return electionService.stopElection();
    }
    
    
}
