/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.eelection.service.Impl;

import com.example.eelection.Database.Database;
import com.example.eelection.bean.Candidat;
import com.example.eelection.bean.Voter;
import com.example.eelection.service.CandidatService;
import java.util.ArrayList;
import org.springframework.stereotype.Service;

/**
 *
 * @author mac
 */
@Service
public class CandidatServiceImpl implements CandidatService {

    VoterServiceImpl voterService = new VoterServiceImpl();

    @Override
    public void save(Candidat candidat) {
        if (Database.election != null) {
            Database.candidats.add(candidat);
        }
    }

    @Override
    public int vote(Candidat candidat) {
        if (Database.election != null) {

        }
        return 0;
    }

    @Override
    public Candidat getWinner() {
        if (Database.election != null) {

        }
        return null;
    }

    @Override
    public ArrayList<Candidat> findAll() {
        if (Database.election != null) {
            return Database.candidats;
        }
        return null;
    }

    @Override
    public Candidat findById(long id) {
        if (Database.election != null) {
            ArrayList<Candidat> candidats = Database.candidats;
            for (Candidat candidat : candidats) {
                if (candidat.getIdCnadidat().equals(id)) {
                    return candidat;
                }
            }
        }
        return null;
    }

    public int findCandidatIndexById(String id) {
        ArrayList<Candidat> candidats = Database.candidats;
        int i = 0;
        for (Candidat candidat : candidats) {
            if (candidat.getIdCnadidat().equals(id)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override
    public int countVotes(String Id) {
        if (Database.election != null) {
            int index = findCandidatIndexById(Id);
            return Database.candidats.get(index).getCount();
        }
        return -1;
    }

    @Override
    public ArrayList<Candidat> findCandidatsByAreaId(String areaId) {
        if (Database.election != null) {
            ArrayList<Candidat> candidats = Database.candidats;
            ArrayList<Candidat> areaCandidats = new ArrayList<>();
            for (Candidat candidat : candidats) {
                if (candidat.getArea().getAreaId().equals(areaId)) {
                    areaCandidats.add(candidat);
                }
            }
            return areaCandidats;
        }
        return null;
    }

    @Override
    public Candidat getWinnerByArea(String areaId) {
        if (Database.election != null) {
            ArrayList<Candidat> candidats = findCandidatsByAreaId(areaId);

            Candidat winnerCandidat = candidats.get(0);

            for (Candidat candidat : candidats) {
                if (candidat.getCount() > winnerCandidat.getCount()) {
                    winnerCandidat = candidat;
                }
            }
            return winnerCandidat;
        }
        return null;
    }

    public ArrayList<Candidat> findCandidatsByVoterId(String voterId) {
        if (Database.election != null) {
            Voter voter = voterService.findVoterById(voterId);

            ArrayList<Candidat> candidats = Database.candidats;
            ArrayList<Candidat> areaCandidats = new ArrayList<>();
            for (Candidat candidat : candidats) {
                if (candidat.getArea().getAreaId().equals(voter.getArea().getAreaId())) {
                    areaCandidats.add(candidat);
                }
            }
            return areaCandidats;
        }
        return null;
    }

}
