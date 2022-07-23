package com.League;

public class Team<T extends Game> implements Comparable <Team<T>>{
    private final String name;
    private int points;
    public Team(String name, int points){
        this.name = name;
        this.points = points;
    }

    public String getName() {
        return name;
    }
    public int getPoints() {
        return points;
    }
    public void setPoints(int points){
        this.points = points;
    }

    @Override
    public int compareTo(Team<T> team) {
        return Integer.compare(this.getPoints(), team.getPoints());
    }
}
