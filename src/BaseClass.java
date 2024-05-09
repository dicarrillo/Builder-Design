/**
 * This class tests the implementation of the builder design pattern to make a pizza
 */

public class BaseClass
{
    public static void main(String[] args)
    {
        PizzaBuilder oldStylePizza;
        PizzaEngineer chef;
        Pizza pizza;

        // Create pizza blueprint and pizza engineer
        oldStylePizza = new OldPizzaBuilder();
        chef = new PizzaEngineer(oldStylePizza);

        // Use pizza engineer to make and store Pizza object
        chef.makePizza();
        pizza = chef.getPizza();

        System.out.println("Pizza made!\n");
        System.out.println("Size: " + pizza.getSize());
        System.out.println("Crust Style: " + pizza.getCrust());
        System.out.println("Cheese Type: " + pizza.getCheese());
        System.out.println("Cheese Amount: " + pizza.getCheeseAmount());

        System.out.println("Toppings...");
        for (String topping : pizza.getToppings())
        {
            System.out.println(topping);
        }
    }
}