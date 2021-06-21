/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.eelection.rest;

import com.example.eelection.bean.Voter;
import com.example.eelection.service.VoterService;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author mac
 */
@RestController
@RequestMapping("/e-elections/admin/voter")
public class VoterRest {
    
    @Autowired
    public VoterService voterService;
   
    @GetMapping(value = "/unautorized")
    public ArrayList<Voter> findAllUnautorizedVoters() {
        return voterService.findAllUnautorizedVoters();
    }
    
    @PostMapping("/autorize/{id}")
    public int autorizeVoter(@PathVariable String id){
        return voterService.autorizeVoter(id);
    }
    
    @PostMapping("/reject/{id}")
    public int rejectVoter(@PathVariable String id){
        return voterService.rejectVoter(id);
    }
    
    

}
