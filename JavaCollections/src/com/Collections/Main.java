package com.Collections;

public class Main {
    public static void main(String[] args) {
        Theatre theatre = new Theatre("Olympian",8,10);
        theatre.getSeats();
        if(theatre.reserveSeat("A02")){
            System.out.println("Pay for the seat");
        }
        else{
            System.out.println("Someone reserved this seat before you");
        }
        if(theatre.reserveSeat("A02")){
            System.out.println("Pay for the seat");
        }
        else{
            System.out.println("Someone reserved this seat before you");
        }
        if(theatre.reserveSeat("A14")){
            System.out.println("Pay for the seat");
        }
        else{
            System.out.println("Someone reserved this seat before you");
        }
    }
}
