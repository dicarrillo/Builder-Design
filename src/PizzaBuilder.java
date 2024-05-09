/**
 * This is the interface that is used to build a Pizza object, according to the blueprint in the implementation of these methods
 */

public interface PizzaBuilder
{
    /**
     * Sets pizza size with predetermined value
     */
    public void buildPizzaSize();

    /**
     * Sets pizza crust with predetermined value
     */
    public void buildPizzaCrust();

    /**
     * Sets pizza cheese type with predetermined value
     */
    public void buildPizzaCheese();

    /**
     * Sets pizza cheese amount with predetermined value
     */
    public void buildPizzaCheeseAmount();

    /**
     * Sets pizza toppings with predetermined list of values
     */
    public void buildPizzaToppings();

    /**
     * Gets pizza object
     *
     * @return object of type Pizza
     */
    public Pizza getPizza();
}