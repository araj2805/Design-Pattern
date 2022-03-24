/*
 * Copyright (c) 2022.
 * @author : Ankit Raj
 */

package com.isitneeded.behavioralPattern.DecoratorPattern;

public class Decaf extends Beverage{
    public Decaf() {
        setDescription("Decaf");
    }

    @Override
    public double cost() {
        return 100;
    }
}
