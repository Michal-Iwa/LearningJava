package Room;

public class Room {
    private Bed bed;
    private Desk desk;
    private Wardrobe wardrobe;
    private Window window;
    private Door door;
    private Lamp lamp;

    public Room(Bed bed, Desk desk, Wardrobe wardrobe, Window window, Door door, Lamp lamp) {
        this.bed = bed;
        this.desk = desk;
        this.wardrobe = wardrobe;
        this.window = window;
        this.door = door;
        this.lamp = lamp;
    }

    public Bed getBed() {
        return bed;
    }

    public Desk getDesk() {
        return desk;
    }

    public Wardrobe getWardrobe() {
        return wardrobe;
    }

    public Window getWindow() {
        return window;
    }

    public Door getDoor() {
        return door;
    }

    public Lamp getLamp() {
        return lamp;
    }
    public void getInRoom(){
        door.openDoor();
        System.out.println("Get in through door");
        lamp.turnOnLights();
        door.closeDoor();
    }
    public void getOutOfRoom(){
        door.openDoor();
        lamp.turnOffLights();
        System.out.println("Get out through door");
        door.closeDoor();
    }
}
