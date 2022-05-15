/*
 * Copyright (c) 2022.
 * @author : Ankit Raj
 */

package com.isitneeded.creationPattern;

public class BlrPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String pizzaType) {
        Pizza pizza = null;

        if (pizzaType.equalsIgnoreCase("cheese"))
            pizza = new BlrStyleCheesePizza();
        else if (pizzaType.equalsIgnoreCase("pepperoni"))
            pizza = new BlrStylePepperoniPizza();

        return pizza;
    }
}
