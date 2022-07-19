package com.Vehicles;

public class Tesla extends Car{
    private boolean automaticDriving;
    public Tesla (){
        super();
        this.automaticDriving = false;
    }
    public Tesla(boolean automaticDriving, String dir, double speed, int gear) {
        super(dir, speed, gear);
        this.automaticDriving = automaticDriving;
    }

    public void setAutomaticDriving(boolean automaticDriving) {
        this.automaticDriving = automaticDriving;
    }
    public boolean getAutomaticDriving(){
        return automaticDriving;
    }
    @Override
    public void howFastIsMoving(){
        System.out.println("Tesla is moving " + getSpeed() + "km/h");
    }

    @Override
    public void handSteering(){
        if(automaticDriving) System.out.println("Tesla is driving by itself and steering " + getDir());
        else System.out.println("Steering " + getDir());
    }
    @Override
    public void changingGears(int gear){
        setGears(gear);
        if(automaticDriving) System.out.println("Tesla changes gear by itself to " + gear);
        else System.out.println("Changing gear by hand to " + gear);
    }
}
