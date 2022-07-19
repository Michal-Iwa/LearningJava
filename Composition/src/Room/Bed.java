package Room;

public class Bed {
    private String mattress;
    private int legs;

    public Bed(String mattress, int legs) {
        this.mattress = mattress;
        this.legs = legs;
    }
    public void lieDownOnBed (){
        System.out.println("You lied down on bed");
    }
    public void gotUpFromBed (){
        System.out.println("You got up from bed");
    }
    public String getMattress() {
        return mattress;
    }

    public int getLegs() {
        return legs;
    }
}
