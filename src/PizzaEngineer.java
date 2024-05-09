/**
 * This class acts as the factory that directs the operations of making a pizza.
 * It uses the methods in the PizzaBuilder interface to actually create a pizza
 */

public class PizzaEngineer
{
    private PizzaBuilder pizzaBuilder;

    /**
     * Creates PizzaBuilder object
     *
     * @param pizzaBuilder
     */
    public PizzaEngineer(PizzaBuilder pizzaBuilder)
    {
        this.pizzaBuilder = pizzaBuilder;
    }

    /**
     * Gets the Pizza object that has been created in the PizzaBuilder object
     *
     * @return
     */
    public Pizza getPizza()
    {
        return pizzaBuilder.getPizza();
    }

    /**
     * Uses the PizzaBuilder object to make a pizza according to the blueprint in OldPizzaBuilder
     */
    public void makePizza()
    {
        pizzaBuilder.buildPizzaSize();
        pizzaBuilder.buildPizzaCrust();
        pizzaBuilder.buildPizzaCheese();
        pizzaBuilder.buildPizzaCheeseAmount();
        pizzaBuilder.buildPizzaToppings();
    }
}