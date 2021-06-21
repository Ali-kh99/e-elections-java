/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.eelection.rest;

import com.example.eelection.bean.Area;
import com.example.eelection.service.AreaService;
import java.util.ArrayList;
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
@RequestMapping("/e-elections/admin/area")
public class AreaRest {
    
    @Autowired
    public AreaService areaService;
    
    @PostMapping("/")
    public void createArea(@RequestBody Area area){
        areaService.createArea(area);
    }
    
    @GetMapping("/")
    public ArrayList<Area> findAll(){
        return null;
//        return areaSareaServiceervice.findAll();
    }
}
