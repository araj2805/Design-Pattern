/*
 * Copyright (c) 2022.
 * @author : Ankit Raj
 */

package com.isitneeded.creationPattern;

import java.util.Scanner;

public class PizzaStoreIssue {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Choice of your PIZZA : ");

        String pizzaType = sc.next();

        PizzaStoreIssue pizzaStoreIssue = new PizzaStoreIssue();

        pizzaStoreIssue.orderPizza(pizzaType);
    }



    public Pizza orderPizza (String pizzaType) {

        Pizza pizza = null;


        /*
        * Here we are fetching pizza object based on the pizzaType attributes and if we want to add new Pizza type or remove existing type
        * then then we need to change this code.
        *
        * */

        if (pizzaType.equals("Cheese"))
            pizza = new CheesePizza();
        else if (pizzaType.equals("Greek"))
            pizza = new GreekPizza();
        else if (pizzaType.equals("Pepperoni"))
            pizza = new PepperoniPizza();


        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;


    }
}
