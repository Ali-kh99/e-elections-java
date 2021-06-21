/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.eelection.rest;

import com.example.eelection.bean.Area;
import com.example.eelection.bean.Candidat;
import com.example.eelection.service.CandidatService;
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
@RequestMapping("/e-elections/admin/candidat")
public class CandidatRest {
    
    @Autowired
    public CandidatService candidatService;
    
    @PostMapping
    public String createCandidat(@RequestBody Candidat candidat){
        return candidatService.createCandidat(candidat);
    }

//    @GetMapping("/winner/area/{id}")
//    public Candidat getWinnerByArea(@PathVariable String id){
//        return candidatService.getWinnerByArea(id);
//    }
    
//    @GetMapping("")
//    public Candidat getWinnerNational(){
//        return candidatService.getWinnerNational();
//    }
    
    
}
