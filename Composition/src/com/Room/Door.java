package com.Room;

public class Door {
    private String material;
    private boolean lockable;
    private boolean hasWindow;

    public Door(String material, boolean lockable, boolean hasWindow) {
        this.material = material;
        this.lockable = lockable;
        this.hasWindow = hasWindow;
    }
    public void openDoor(){
        System.out.println("Door opened");
    }
    public void closeDoor(){
        System.out.println("Door closed");
    }

    public String getMaterial() {
        return material;
    }

    public boolean isLockable() {
        return lockable;
    }

    public boolean isHasWindow() {
        return hasWindow;
    }

}
