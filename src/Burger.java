public class Burger {
    private String name;
    private String bread;
    private String meet;
    private double price;
    private int numberOfAdition;
    private double totalPrice = 0;
    public Burger()
    {
        this.name = "Basic Burger";
        this.bread = "While";
        this. meet = "Beef";
        this.numberOfAdition = 4;
        this.price = 10.0;
    }
public Burger(String name, String bread, String meet, int numberOfAdition, double price)
    {
        this.name = name;
        this.bread = bread;
        this. meet = meet;
        this.numberOfAdition = numberOfAdition;
        this.price = price;
    }
    public double getPrice()
    {
        return this.price;
    }
    public String getName()
    {
        return this.name;
    }
    public int getNumberOfAdition()
    {
        return numberOfAdition;
    }
    public double getTotalPrice()
    {
        return this.totalPrice;
    }

    public void increesPrice(double numberOfIncrees) // creste pretul Total
    {
        this.totalPrice += numberOfIncrees;
    }

    public void type()
    {
        System.out.println("1. Basic(White bred, beef)  10.0$");
        System.out.println("2. Healthy(Brown ray bred, Chicken)  12.5$");
        System.out.println("3. Delux(White bred, Pork) + Chips + Drink  15.5$");
    }

}
