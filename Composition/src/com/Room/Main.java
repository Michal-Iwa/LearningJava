package com.Room;

public class Main {
    public static void main (String [] args){
        Door door = new Door("wood",true,false);
        Bed bed = new Bed("soft and comfy", 4);
        Lamp lamp = new Lamp("pretty", 600);
        Window window = new Window("plastic","glass",10);
        Desk desk = new Desk("wood",4);
        Wardrobe wardrobe = new Wardrobe(3,2);
        Room room = new Room(bed,desk,wardrobe,window,door,lamp);
        room.getInRoom();
        room.getLamp().turnOffLights();
        room.getLamp().switchLightbulb(700);
        room.getLamp().turnOnLights();
        room.getOutOfRoom();
    }

}
