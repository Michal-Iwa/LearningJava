public class Mitsubishi extends Car{
    public Mitsubishi(int cylinders, String name){
        super(cylinders, name);
    }
    @Override
    public String startEngine(){
        System.out.println("Mitsubishi class starts engine");
        return "Mitsubishi -> startEngine()";
    }
    @Override
    public String accelerate(){
        System.out.println("Mitsubishi class speeds up");
        return "Mitsubishi -> accelerate()";
    }
    
    @Override
    public String brake(){
        System.out.println("Mitsubishi class slows down");
        return "Mitsubishi -> brake()";
    }
}
