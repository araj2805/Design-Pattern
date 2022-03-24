/*
 * Copyright (c) 2022.
 * @author : Ankit Raj
 */

package com.isitneeded.behavioralPattern.DecoratorPattern;

public class Espresso extends Beverage{

    public Espresso() {
        setDescription("Espresso");
    }

    @Override
    public double cost() {
        return 95;
    }
}
