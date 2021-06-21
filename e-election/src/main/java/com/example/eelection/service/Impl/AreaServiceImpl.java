/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.eelection.service.Impl;

import com.example.eelection.Database.Database;
import com.example.eelection.bean.Area;
import com.example.eelection.bean.Party;
import com.example.eelection.service.AreaService;
import java.rmi.RemoteException;
import java.util.ArrayList;
import org.springframework.stereotype.Service;

/**
 *
 * @author mac
 */
@Service
public class AreaServiceImpl implements AreaService{
  
            
    @Override
    public void save(Area area) throws RemoteException {
            System.out.println("Area { id :" + area.getAreaId() + ", Name: " + area.getArea());
            Database.areas.add(area);
    }
    
    public ArrayList<Area> findAll(){
        return Database.areas;
    }
    
    public Area findById(String id){
       ArrayList<Area> areas = Database.areas;
        for (Area area : areas) {
            if (area.getAreaId().equals(id)) {
                return area;
            }
        }
        return null;
    }
    
    public Area findByName(String name){
       ArrayList<Area> areas = Database.areas;
        for (Area area : areas) {
            if (area.getArea().equals(name)) {
                return area;
            }
        }
        return null;
    }
            
}
