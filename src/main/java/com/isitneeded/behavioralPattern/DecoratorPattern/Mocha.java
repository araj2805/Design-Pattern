/*
 * Copyright (c) 2022.
 * @author : Ankit Raj
 */

package com.isitneeded.behavioralPattern.DecoratorPattern;



public class Mocha extends IngredientsDecorator{


    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " , Mocha";
    }

    @Override
    public double cost() {
        double cost = beverage.cost();

        if (beverage.getSize() == Size.TALL)
            cost += 10;
        else if (beverage.getSize() == Size.GRANDE)
            cost += 20;
        else if (beverage.getSize() == Size.VENTI)
            cost += 30;

//        return beverage.cost() + 40 + sizeCost;

        return cost;
    }

}
