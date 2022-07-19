package com.Vehicles;



public class Main {

    public static void main (String [] args){
        Tesla tesla = new Tesla();
        tesla.handSteering();
        tesla.setDir("Right");
        tesla.handSteering();
        tesla.changingGears(1);
        tesla.setAutomaticDriving(true);
        tesla.handSteering();
        tesla.changingGears(2);
    }
}
