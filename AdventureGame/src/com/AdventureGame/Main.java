package com.AdventureGame;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Map<Integer, Location> locations = new HashMap<Integer, Location>();
    private static Map<String, String> vocabulary = new HashMap<String, String>();

    public static void main(String[] args) {
        Map<String, Integer> exits = new HashMap<String, Integer>();
        locations.put(0, new Location(0, "You are sitting in front of a computer learning Java",null));
        exits.put("N",5);
        exits.put("E",3);
        exits.put("S",4);
        exits.put("W",2);
        //exits.put("Q",0);
        locations.put(1, new Location(1, "You are standing at the end of a road before a small brick building",exits));

        exits = new HashMap<String, Integer>();
        exits.put("N",5);
        //exits.put("Q",0);
        locations.put(2, new Location(2, "You are at the top of a hill",exits));

        exits = new HashMap<String, Integer>();
        exits.put("W",1);
        //exits.put("Q",0);
        locations.put(3, new Location(3, "You are inside a building, a well house for a small spring",exits));

        exits = new HashMap<String, Integer>();
        exits.put("W",2);
        exits.put("N",1);
        //exits.put("Q",0);
        locations.put(4, new Location(4, "You are in a valley beside a stream",exits));

        exits = new HashMap<String, Integer>();
        exits.put("S",1);
        exits.put("W",2);
        //exits.put("Q",0);
        locations.put(5, new Location(5, "You are in the forest",exits));

        command();

    }
    private static void command(){
        Scanner scanner = new Scanner(System.in);
        vocabulary.put("QUIT", "Q");
        vocabulary.put("NORTH", "N");
        vocabulary.put("SOUTH", "S");
        vocabulary.put("EAST", "E");
        vocabulary.put("WEST", "W");
        int loc = 1;
        while (true) {
            System.out.println(locations.get(loc).getDescription());
            if (loc == 0) {
                break;
            }

            Map<String, Integer> exits = locations.get(loc).getExits();
            System.out.println("Available exits are ");

            for( String exit: exits.keySet()){
                System.out.print(exit + ", ");
            }
            System.out.println();
            String direction = scanner.nextLine().toUpperCase();

            if (direction.length() > 1) {
                String[] words = direction.split(" ");
                for(String word : words){
                    if(vocabulary.containsKey(word)){
                        direction = vocabulary.get(word);
                    }
                }
            }
            if(exits.containsKey(direction)){
                loc = exits.get(direction);
            }
            else{
                System.out.println("You cannot go in that direction");
            }
        }
    }
}

