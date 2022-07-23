package com.League;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Team<Football> arsenal = new Team<>("Arsenal", 20);
        Team<Football> chelsea = new Team<>("Chelsea", 32);
        Team<Football> manUnited = new Team<>("Manchester United", 12);
        Team<Basketball> chicagoBulls = new Team<>("Chicago Bulls", 78);
        Team<Basketball> lakers = new Team<>("Lakers", 24);
        Team<Volleyball> poland = new Team<>("Poland", 9);
        Team<Volleyball> brazil = new Team<>("Brazil", 8);
        Team<Volleyball> iran = new Team<>("Iran", 7);
        LeagueTable<Football> premierLeague = new LeagueTable<>("Premier League");
        LeagueTable<Basketball> nba = new LeagueTable<>("NBA");
        LeagueTable<Volleyball> volleyballWorldChampionships = new LeagueTable<>("Volleyball world championships");
        premierLeague.addTeamToLeague(arsenal);
        premierLeague.addTeamToLeague(chelsea);
        premierLeague.addTeamToLeague(manUnited);
        // premierLeague.addTeamToLeague(lakers); this doesn't work because of generics
        nba.addTeamToLeague(lakers);
        nba.addTeamToLeague(chicagoBulls);
        volleyballWorldChampionships.addTeamToLeague(iran);
        volleyballWorldChampionships.addTeamToLeague(brazil);
        volleyballWorldChampionships.addTeamToLeague(poland);
        volleyballWorldChampionships.addTeamToLeague(poland);
        System.out.println(volleyballWorldChampionships);
        System.out.println();
        System.out.println(nba);
        System.out.println();
        System.out.println(premierLeague);
        System.out.println();

        Collections.sort(volleyballWorldChampionships.getTeams());
        Collections.sort(nba.getTeams());
        Collections.sort(premierLeague.getTeams());
        Collections.reverse(volleyballWorldChampionships.getTeams());
        Collections.reverse(nba.getTeams());
        Collections.reverse(premierLeague.getTeams());

        System.out.println(" Sorted :");

        System.out.println(volleyballWorldChampionships);
        System.out.println();
        System.out.println(nba);
        System.out.println();
        System.out.println(premierLeague);
        System.out.println();
        poland.setPoints(12);
        iran.setPoints(11);

        System.out.println(volleyballWorldChampionships);
        System.out.println();

        Collections.sort(volleyballWorldChampionships.getTeams());
        Collections.reverse(volleyballWorldChampionships.getTeams());
        System.out.println(volleyballWorldChampionships);
        System.out.println();

    }
}
