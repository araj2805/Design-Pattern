/*
 * Copyright (c) 2022.
 * @author : Ankit Raj
 */

package com.isitneeded.behavioralPattern.DecoratorPattern;

public class StarBuzzCoffee {
    public static void main(String[] args) {

        Beverage beverage = new HouseBlend();
        System.out.println(beverage.getDescription() + " Rs. "+beverage.cost());

        Beverage espresso = new Espresso();

        espresso = new Mocha(espresso);
        espresso = new Mocha(espresso);
        espresso = new Whip(espresso);

        System.out.println( espresso.getDescription() + " Rs. "+ espresso.cost());


        Beverage homeBlend = new HouseBlend(Size.GRANDE);

        homeBlend = new Mocha(homeBlend);
        homeBlend = new Mocha(homeBlend);

        System.out.println( homeBlend.getDescription() + " Rs. "+ homeBlend.cost());

    }
}
