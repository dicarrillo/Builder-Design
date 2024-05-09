/**
 * This class is an implementation of the PizzaPlan interface, and contains the methods to set the attributes for a Pizza object
 */

public class Pizza implements PizzaPlan
{
    private String size;
    private String crust;
    private String cheese;
    private String cheeseAmount;
    private String[] toppings;

    public void setPizzaSize(String pizzaSize)
    {
        size = pizzaSize;
    }

    public void setCrustStyle(String crustStyle)
    {
        crust = crustStyle;
    }

    public void setCheeseType(String cheeseType)
    {
        cheese = cheeseType;
    }

    public void setCheeseAmount(String cheeseAmount)
    {
        this.cheeseAmount = cheeseAmount;
    }

    public void setToppings(String[] toppings)
    {
        this.toppings = toppings;
    }

    public String getSize()
    {
        return size;
    }

    public String getCrust()
    {
        return crust;
    }

    public String getCheese()
    {
        return cheese;
    }

    public String getCheeseAmount()
    {
        return cheeseAmount;
    }

    public String[] getToppings()
    {
        return toppings;
    }
}