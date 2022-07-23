package com.Team;

import java.util.ArrayList;

public class Team <T extends Player> implements Comparable<Team<T>> {
    private int points;
    private ArrayList<T> members = new ArrayList<>();
    private String name;
    public Team(String name, int points){
        this.name = name;
        this.points = points;
    }
    public boolean addMember(T potentialMember){
        if(members.contains(potentialMember)){
            System.out.println("Player already in a team");
            return false;
        }
        members.add(potentialMember);
        System.out.println("Player added to a team");
        return true;

    }

    public int getPoints() {
        return points;
    }

    @Override
    public int compareTo(Team<T> team) {
        if(this.points < team.getPoints()) return 1;
        if(this.points > team.getPoints()) return -1;
        return 0;
    }
}
