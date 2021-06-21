/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.eelection.Database;

import com.example.eelection.bean.Area;
import com.example.eelection.bean.Ballot;
import com.example.eelection.bean.Candidat;
import com.example.eelection.bean.Election;
import com.example.eelection.bean.Party;
import com.example.eelection.bean.Vote;
import com.example.eelection.bean.Voter;
import java.security.PublicKey;
import java.util.ArrayList;

/**
 *
 * @author mac
 */
public class Database {
    // ??
    public static ArrayList<PublicKey> publicKeysVoted = new ArrayList<PublicKey>();

    public static ArrayList<Candidat> candidats = new ArrayList<Candidat>();
    
    public static ArrayList<Voter> voters = new ArrayList<Voter>();

    public static ArrayList<Ballot> ballots = new ArrayList<>();

    public static Election election = null;

    public static ArrayList<Area> areas = new ArrayList<>();

    public static ArrayList<Vote> votes = new ArrayList<>();

    public static ArrayList<Party> parties = new ArrayList<>();
        
}
