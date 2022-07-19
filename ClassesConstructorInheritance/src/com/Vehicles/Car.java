package com.Vehicles;

public class Car extends Vehicle{
    private int gear;

    public int getGears(){
        return gear;
    }
    public void setGears(int gear) {
        this.gear = gear;
    }
    public void changingGears(int gear){
        setGears(gear);
        System.out.println("Changing gear by hand to " + gear);
    }
    public Car(){
        this("Straight", 0, 0);
    }
    public Car(String dir, double speed, int gear){
        super(dir,speed);
        this.gear = gear;
    }
    @Override
    public void howFastIsMoving(){
        System.out.println("Car is moving " + getSpeed() + "km/h");
    }

}
