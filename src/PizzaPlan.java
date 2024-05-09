/**
 * This is the interface that is accessed by a pizza builder to set the attributes for a Pizza object
 */

public interface PizzaPlan
{
    /**
     * Sets the pizza size
     *
     * @param pizzaSize desired size of pizza (small, medium, large)
     */
    public void setPizzaSize(String pizzaSize);

    /**
     * Sets the style of the pizza crust
     *
     * @param crustStyle desired crust style (thin, original, pan)
     */
    public void setCrustStyle(String crustStyle);

    /**
     * Sets the type of cheese for the pizza
     *
     * @param cheeseType desired cheese type (mozzarella, cheddar, swiss)
     */
    public void setCheeseType(String cheeseType);

    /**
     * Sets the amount of cheese for the pizza
     *
     * @param cheeseAmount desired cheese amount (easy, original, extra)
     */
    public void setCheeseAmount(String cheeseAmount);

    /**
     * Sets the toppings for the pizza
     *
     * @param toppings list of desired toppings
     */
    public void setToppings(String[] toppings);

    /**
     * Get size of pizza
     *
     * @return pizza size
     */
    public String getSize();

    /**
     * Get pizza crust
     *
     * @return crust style
     */
    public String getCrust();

    /**
     * Get pizza cheese type
     *
     * @return type of cheese
     */
    public String getCheese();

    /**
     * Get pizza cheese amount
     *
     * @return cheese amount
     */
    public String getCheeseAmount();

    /**
     * Get pizza toppings
     *
     * @return list of toppings
     */
    public String[] getToppings();
}