package com.Collections;

import java.sql.Array;
import java.sql.SQLOutput;
import java.util.*;

public class Theatre {
    private final String theatreName;
    //private List<Seat> seats = new ArrayList<>();
    // could also write new : Sets(HashSet, LinkedHashSet),
    // Lists(LinkedList)
    //private Collection<Seat> seats = new TreeSet<>();
    private List<Seat> seats = new ArrayList<>();

    public Theatre(String theatreName, int numRows, int seatsPerRow) {
        this.theatreName = theatreName;
        int lastRow = 'A' + (numRows - 1);
        for (char row = 'A'; row <= lastRow; row++){
            for(int seatNum = 1; seatNum <= seatsPerRow; seatNum++){
                Seat seat = new Seat(row + String.format("%02d",seatNum),20.99);
                seats.add(seat);
            }
        }
    }

    public String getTheatreName() {
        return theatreName;
    }

    public boolean reserveSeat(String seatNumber){
        Seat requestedSeat = new Seat(seatNumber, 0);
        int foundSeat = Collections.binarySearch(seats, requestedSeat, null);
        if(foundSeat >= 0){
            return seats.get(foundSeat).reserve();
        }

        System.out.println("There is no seat " + seatNumber);
        return false;
    }
    public void getSeats(){
        for (Seat seat : seats){
            System.out.println(seat.getSeatNumber());
        }
    }
    private class Seat implements Comparable<Seat>{
        private final String seatNumber;
        private double price;
        private boolean reserved = false;
        public Seat(String seatNumber, double price){
            this.price = price;
            this.seatNumber = seatNumber;
        }
        public boolean reserve(){
            if(!reserved){
                reserved = true;
                System.out.println("Seat " + seatNumber + " was reserved");
                return true;
            }
            return false;
        }
        public Collection<Seat> getSeats(){
            return seats;
        }
        public boolean cancel(){
            if(reserved){
                reserved = false;
                System.out.println("Reservationof seat" + seatNumber + " was canceled");
                return true;
            }
            return false;
        }

        public String getSeatNumber() {
            return seatNumber;
        }

        public double getPrice() {
            return price;
        }

        public boolean isReserved() {
            return reserved;
        }

        @Override
        public int compareTo(Seat seat) {
            return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
        }
    }
}
