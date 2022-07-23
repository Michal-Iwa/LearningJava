package com.Team;

import com.Team.BasketballPlayer;
import com.Team.FootballPlayer;

public class Main {
    public static void main(String[] args) {
        FootballPlayer footballPlayer1 = new FootballPlayer("Albert");
        FootballPlayer footballPlayer2 = new FootballPlayer("Blbert");
        FootballPlayer footballPlayer3 = new FootballPlayer("Clbert");
        FootballPlayer footballPlayer4 = new FootballPlayer("Dlbert");
        VolleyballPlayer volleyballPlayer1 = new VolleyballPlayer("Elbert");
        BasketballPlayer basketballPlayer = new BasketballPlayer("Flbert");
        Team<FootballPlayer> alabama1 = new Team<>("Alabama10", 10);
        Team<FootballPlayer> alabama2 = new Team<>("Alabama23", 23);
        Team<FootballPlayer> alabama3 = new Team<>("Alabama42", 42);
        Team<FootballPlayer> alabama4 = new Team<>("Alabama39", 39);

        alabama1.addMember(footballPlayer2);
        alabama1.addMember(footballPlayer1);
        alabama2.addMember(footballPlayer2);
        alabama2.addMember(footballPlayer2);
        alabama3.addMember(footballPlayer4);
        alabama3.addMember(footballPlayer3);
    }
}
