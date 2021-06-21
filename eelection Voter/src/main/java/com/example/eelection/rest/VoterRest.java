/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.eelection.rest;

import com.example.eelection.bean.Voter;
import com.example.eelection.service.VoterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author mac
 */
@RestController
@RequestMapping("/e-elections/voter")
public class VoterRest {
    @Autowired
    public VoterService voterService;
    
    @PostMapping(value = "/")
    public void save(@RequestBody Voter voter) {
        voterService.save(voter);
    }
    
    
}
