package Room;

public class Desk {
    private String material;
    private int legs;

    public Desk(String material, int legs) {
        this.material = material;
        this.legs = legs;
    }

    public String getMaterial() {
        return material;
    }

    public int getLegs() {
        return legs;
    }
}
