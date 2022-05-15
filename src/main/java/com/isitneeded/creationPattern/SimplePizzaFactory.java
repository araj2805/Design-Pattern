/*
 * Copyright (c) 2022.
 * @author : Ankit Raj
 */

package com.isitneeded.creationPattern;

public class SimplePizzaFactory {

    private Pizza pizza;

    public Pizza createPizza ( String pizzaType) {

        if (pizzaType.equalsIgnoreCase("Cheese"))
            pizza = new CheesePizza();
        else if (pizzaType.equalsIgnoreCase("Greek"))
            pizza = new GreekPizza();
        else if (pizzaType.equalsIgnoreCase("Pepperoni"))
            pizza = new PepperoniPizza();
        else if (pizzaType.equalsIgnoreCase("CheeseBurst"))
            pizza = new CheesePizza();

        return pizza;

    }

}
