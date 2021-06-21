/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.eelection.service.Impl;

import com.example.eelection.Database.Database;
import com.example.eelection.bean.Election;
import com.example.eelection.service.ElectionService;
import java.rmi.RemoteException;
import java.util.Date;
import java.util.Objects;
import org.springframework.stereotype.Service;

/**
 *
 * @author mac
 */
@Service
public class ElectionServiceImpl implements ElectionService {

//    @Override
//    public int save(Election election) {
//        if (Database.election == null) {
//            if(election.getStartDate().before(election.getEndDate()) && election.getStartDate().after(new Date())){
//               Database.election = election;
//               return 1;
//            }else{
//                return -2;
//            }
//        }else{
//            return -1;
//        }
//        
//    }
    @Override
    public int save(Election election) {
        if (Database.election == null) {
            Database.election = election;
            return 1;
        } else {
            return -1;
        }

    }

    @Override
    public int startElection() {
        if (Database.election != null) {
            if (Objects.equals(Database.election.getStarted(), Boolean.TRUE)) {
                return -1;
            } else {
                Database.election.setStarted(Boolean.TRUE);
                return 1;
            }
        }
        return -2;
    }

    @Override
    public int stopElection() {
        if (Database.election != null) {
            if (Objects.equals(Database.election.getStoped(), Boolean.TRUE) || Objects.equals(Database.election.getStarted(), Boolean.FALSE)) {
                return -1;
            } else {
                Database.election.setStoped(Boolean.TRUE);
                return 1;
            }
        }
        return -2;
    }

}
