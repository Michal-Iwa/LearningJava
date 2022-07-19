package com.CarpetCostCalculator;

public class Floor {
    private double width;
    private double length;

    public Floor(double width, double length){
        if(width < 0) width = 0;
        if(length < 0) length = 0;
        this.length = length;
        this.width = width;
    }
    public double getArea(){
        return this.width * this.length;
    }
}
