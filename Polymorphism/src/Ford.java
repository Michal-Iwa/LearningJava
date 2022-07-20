public class Ford extends Car{
    public Ford(int cylinders, String name){
        super(cylinders, name);
    }

    @Override
    public String startEngine(){
        System.out.println("Ford class starts engine");
        return "Ford -> startEngine()";
    }
    @Override
    public String accelerate(){
        System.out.println("Ford class speeds up");
        return "Ford -> accelerate()";
    }
    @Override
    public String brake(){
        System.out.println("Ford class slows down");
        return "Ford -> brake()";
    }
}
