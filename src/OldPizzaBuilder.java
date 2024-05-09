/**
 * This class is the implementation of the PizzaBuilder interface, and acts as the blueprint to build the desired Pizza object
 */

public class OldPizzaBuilder implements PizzaBuilder
{
    private Pizza pizza;    // Pizza object being built

    /**
     * Create empty pizza object
     */
    public OldPizzaBuilder()
    {
        pizza = new Pizza();
    }

    public void buildPizzaSize()
    {
        pizza.setPizzaSize("large");
    }

    public void buildPizzaCrust()
    {
        pizza.setCrustStyle("pan");
    }

    public void buildPizzaCheese()
    {
        pizza.setCheeseType("swiss");
    }

    public void buildPizzaCheeseAmount()
    {
        pizza.setCheeseAmount("extra");
    }

    public void buildPizzaToppings()
    {
        // Create and populate an array of toppings
        String[] toppingsArray = new String[3];

        toppingsArray[0] = "pepperoni";
        toppingsArray[1] = "sausage";
        toppingsArray[2] = "olives";

        // Set toppings for pizza object
        pizza.setToppings(toppingsArray);
    }

    public Pizza getPizza()
    {
        return pizza;
    }
}