package com.Animals;

public abstract class Animal {
    private String name;
    public Animal(String name){
        this.name = name;
    }
    public abstract void eat(); //these have to be implemented
    public abstract void breathe(); // because of abstract key word
    public String getName() {
        return name;
    }
}
