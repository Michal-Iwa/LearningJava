package com.FileWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Locations implements Map<Integer, Location> {
    private static Map<Integer, Location> locations = new HashMap<Integer, Location>();
    public static void main (String [] args) throws IOException{
        FileWriter locFile = null;
        // #3 example to handle writing to file
        try{
            locFile = new FileWriter("Locations.txt");
            for (Location location : locations.values()){
                locFile.write(location.getLocationID() + "," + location.getDescription());
                throw new IOException("test exception while writing");
            }
        }
        finally {
            System.out.println("In finally block");
            if (locFile != null) {
                System.out.println("Attempting to close locFile");
                locFile.close();
            }
        }

        // #2 example to handle writing to file without throws
//        try{
//            locFile = new FileWriter("Locations.txt");
//            for (Location location : locations.values()){
//                locFile.write(location.getLocationID() + "," + location.getDescription());
//            }
//        }
//        catch (IOException e){
//            System.out.println("In catch block");
//            e.printStackTrace();
//        }
//        finally{
//            System.out.println("In finally block");
//            try{
//                if(locFile != null){
//                    System.out.println("Attempting to close locFile");
//                    locFile.close();
//                }
//            }
//            catch(IOException e){
//                e.printStackTrace();
//            }
//        }

        // #1 example to handle writing to file without throws
//        try(FileWriter locFile = new FileWriter("Locations.txt")) {
//            for (Location location : locations.values()){
//                locFile.write(location.getLocationID() + "," + location.getDescription());
//            }
//        }catch (IOException e){
//            System.out.println("In catch block");
//            e.printStackTrace();
//        }
        // finally block always gets executed
    }

    static {
        Map<String, Integer> tempExit = new HashMap<String, Integer>();
        locations.put(0, new Location(0, "You are sitting in front of a computer learning Java",null));

        tempExit = new HashMap<String, Integer>();
        tempExit.put("W", 2);
        tempExit.put("E", 3);
        tempExit.put("S", 4);
        tempExit.put("N", 5);
        locations.put(1, new Location(1, "You are standing at the end of a road before a small brick building",tempExit));

        tempExit = new HashMap<String, Integer>();
        tempExit.put("N", 5);
        locations.put(2, new Location(2, "You are at the top of a hill",tempExit));

        tempExit = new HashMap<String, Integer>();
        tempExit.put("W", 1);
        locations.put(3, new Location(3, "You are inside a building, a well house for a small spring",tempExit));

        tempExit = new HashMap<String, Integer>();
        tempExit.put("N", 1);
        tempExit.put("W", 2);
        locations.put(4, new Location(4, "You are in a valley beside a stream",tempExit));

        tempExit = new HashMap<String, Integer>();
        tempExit.put("S", 1);
        tempExit.put("W", 2);
        locations.put(5, new Location(5, "You are in the forest",tempExit));

    }
    @Override
    public int size() {
        return locations.size();
    }

    @Override
    public boolean isEmpty() {
        return locations.isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        return locations.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return locations.containsValue(value);
    }

    @Override
    public Location get(Object key) {
        return locations.get(key);
    }

    @Override
    public Location put(Integer key, Location value) {
        return locations.put(key, value);
    }

    @Override
    public Location remove(Object key) {
        return locations.remove(key);
    }

    @Override
    public void putAll(Map<? extends Integer, ? extends Location> m) {

    }

    @Override
    public void clear() {
        locations.clear();

    }

    @Override
    public Set<Integer> keySet() {
        return locations.keySet();
    }

    @Override
    public Collection<Location> values() {
        return locations.values();
    }

    @Override
    public Set<Entry<Integer, Location>> entrySet() {
        return locations.entrySet();
    }
}