package Room;

public class Lamp {
    private String lampshade;
    private int brightness;
    public Lamp (String lampshade, int brightness){
        this.brightness = brightness;
        this.lampshade = lampshade;
    }
    public void switchLightbulb(int brightness){
        this.brightness = brightness;
        System.out.println("Lightbulb swiched to " + brightness + " lumens");
    }
    public String getLampshade() {
        return lampshade;
    }

    public int getBrightness() {
        return brightness;
    }
    public void turnOnLights(){
        System.out.println("Light turned on, brightness is " + brightness + " lumens");
    }
    public void turnOffLights(){
        System.out.println("Lights turned off");
    }
}
