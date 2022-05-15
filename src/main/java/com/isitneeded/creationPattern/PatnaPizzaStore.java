/*
 * Copyright (c) 2022.
 * @author : Ankit Raj
 */

package com.isitneeded.creationPattern;

public class PatnaPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String pizzaType) {

        Pizza pizza = null;

        if (pizzaType.equalsIgnoreCase("cheese"))
            pizza = new PatnaStyleCheesePizza();
        else if (pizzaType.equalsIgnoreCase("pepperoni"))
            pizza = new PatnaStylePepperoniPizza();

        return pizza;
    }
}
