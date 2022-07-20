public class Holden extends Car{
    public Holden(int cylinders, String name){
        super(cylinders, name);
    }
    @Override
    public String startEngine(){
        System.out.println("Holden class starts engine");
        return getClass().getSimpleName() + " -> startEngine()";
    }
    @Override
    public String accelerate(){
        System.out.println("Holden class speeds up");
        return getClass().getSimpleName() + " -> accelerate()";
    }
    @Override
    public String brake(){
        System.out.println("Holden class slows down");
        return getClass().getSimpleName() + " -> brake()";
    }
}
