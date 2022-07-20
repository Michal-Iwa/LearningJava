public class HealthyBurger extends Hamburger{
    private String healthyExtra1Name,  healthyExtra2Name;
    private double healthyExtra1Price, healthyExtra2Price;
    public HealthyBurger(String meat, double price){
        super("Healthy burger",meat,price,"Multigrain");
    }
    public void addHealthyAddition1(String healthyExtra1Name, double healthyExtra1Price){
        this.healthyExtra1Price = healthyExtra1Price;
        this.healthyExtra1Name = healthyExtra1Name;
        System.out.println("Added " + healthyExtra1Name +" for an extra " + healthyExtra1Price);
    }
    public void addHealthyAddition2(String healthyExtra2Name, double healthyExtra2Price){
        this.healthyExtra2Price = healthyExtra2Price;
        this.healthyExtra2Name = healthyExtra2Name;
        System.out.println("Added " + healthyExtra2Name +" for an extra " + healthyExtra2Price);
    }
    @Override
    public double itemizeHamburger(){
        double totalPrice = super.itemizeHamburger() + healthyExtra1Price + healthyExtra2Price;
        System.out.println("Total Healthy Burger price is " + totalPrice);
        return totalPrice;
    }
}
