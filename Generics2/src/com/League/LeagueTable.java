package com.League;

import java.util.ArrayList;

public class LeagueTable <T extends Game> {
    private String leagueName;
    private ArrayList<Team<T>> teams;

    public String getLeagueName() {
        return leagueName;
    }

    public ArrayList<Team<T>> getTeams() {
        return teams;
    }

    public LeagueTable(String leagueName) {
        this.leagueName = leagueName;
        this.teams = new ArrayList<Team<T>>();
    }
    public boolean addTeamToLeague(Team<T> team){
        if(teams.contains(team)){
            System.out.println(team.getName() + " is already in " + leagueName);
            return false;
        }
        teams.add(team);
        System.out.println(team.getName() + " was added to " + leagueName);
        return true;
    }

    @Override
    public String toString() {
        String string = "=========" + leagueName + "=========\n";
        string +=       "Teams          ======       Points\n";
        for(Team team : teams){
            string += team.getName() + " ======== " + team.getPoints() + "\n";
        }
        return string;
    }
}
