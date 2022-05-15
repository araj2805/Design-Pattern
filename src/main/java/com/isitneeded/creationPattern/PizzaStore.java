/*
 * Copyright (c) 2022.
 * @author : Ankit Raj
 */

package com.isitneeded.creationPattern;

public abstract class PizzaStore {



    /*
    * Moving to factory method to have different factory
    *
    * */

    /*SimplePizzaFactory pizzaFactory;

    PizzaStore (SimplePizzaFactory pizzaFactory) {
        this.pizzaFactory = pizzaFactory;
    }*/

    public Pizza orderPizza (String pizzaType) {

        Pizza pizza = null;

//        Pizza pizza = pizzaFactory.createPizza(pizzaType);

        pizza = createPizza(pizzaType);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    protected abstract Pizza createPizza(String pizzaType);

}
