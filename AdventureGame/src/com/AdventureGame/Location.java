package com.AdventureGame;

import java.util.HashMap;
import java.util.Map;

public final class Location {
    private final int locationID;
    private final String description;
    private final Map<String, Integer> exits;

    public Location(int locationID, String description, Map<String, Integer> exits) {
        this.locationID = locationID;
        this.description = description;
        if(exits == null){
            this.exits = new HashMap<String, Integer>();
        }
        else{
            this.exits = new HashMap<String, Integer>(exits);
        }
        this.exits.put("Q", 0);
    }

    public int getLocationID() {
        return locationID;
    }

    public String getDescription() {
        return description;
    }

    //nothing outside class can change exits, so we return
    //copy of Map(created with new) to the object making it immutable
    public Map<String, Integer> getExits() {
        return new HashMap<String, Integer>(exits); //creating Deep copy of an object
    }

    //Shallow copy two objects pointing to the same memory
    //Deep Copy creating two separate objects that have same contens

}
