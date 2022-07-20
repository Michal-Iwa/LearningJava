public class Car {
    private int cylinders;
    private String name;
    private int wheels;
    private boolean engine;
    public Car(int cylinders, String name){
        this.name = name;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.engine = true;
    }
    public String startEngine(){
        System.out.println("Car class starts engine");
        return "Car -> startEngine()";
    }
    public String accelerate(){
        System.out.println("Car class speeds up");
        return "Car -> accelerate()";
    }
    public String brake(){
        System.out.println("Car class slows down");
        return "Car -> brake()";
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
}
