package com.Vehicles;

public class Vehicle {
    public Vehicle(String dir, double speed) {
        this.dir = dir;
        this.speed = speed;
    }
    public Vehicle() {
        this("Straight", 0);
    }

    private String dir;
    private double speed;

    public double getSpeed() {
        return speed;
    }
    public void setSpeed(double speed) {
        this.speed = speed;
    }
    public String getDir() {
        return dir;
    }
    public void setDir(String dir) {
        this.dir = dir;
    }
    public void handSteering(){
        System.out.println("Steering " + dir);
    }
    public void howFastIsMoving(){
        System.out.println("Vehicle is moving " + speed + "km/h");
    }

}
