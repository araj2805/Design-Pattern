/*
 * Copyright (c) 2022.
 * @author : Ankit Raj
 */

package com.isitneeded.behavioralPattern.DecoratorPattern;

public class Whip extends IngredientsDecorator{

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 60;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " , Whip";
    }
}
