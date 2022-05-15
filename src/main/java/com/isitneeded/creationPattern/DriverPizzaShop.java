/*
 * Copyright (c) 2022.
 * @author : Ankit Raj
 */

package com.isitneeded.creationPattern;

public class DriverPizzaShop {
    public static void main(String[] args) {
        /*SimplePizzaFactory pizzaFactory = new SimplePizzaFactory();

        PizzaStore pizzaStore = new PizzaStore(pizzaFactory);

        pizzaStore.orderPizza("Cheese");*/

        PizzaStore patnaStore = new PatnaPizzaStore();
        patnaStore.orderPizza("cheese");

        System.out.println();

        PizzaStore blrStore = new BlrPizzaStore();
        blrStore.orderPizza("pepperoni");


    }
}
