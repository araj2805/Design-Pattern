/*
 * Copyright (c) 2022.
 * @author : Ankit Raj
 */

package com.isitneeded.behavioralPattern.DecoratorPattern;

public class CondensedMilk extends IngredientsDecorator{

    public CondensedMilk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 50;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " , CondensedMilk";
    }
}
