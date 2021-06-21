/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.eelection.rest;

import com.example.eelection.service.VoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author mac
 */
@RestController
@RequestMapping("/e-elections/voter/vote")
public class VoteRest {

    @Autowired
    public VoteService voteService;

    @PostMapping(value = "/voter/{voterId}/candidat/{candidatId}")
    public int vote(@PathVariable String voterId, @PathVariable String candidatId) {
        return voteService.vote(voterId, candidatId);
    }
}
