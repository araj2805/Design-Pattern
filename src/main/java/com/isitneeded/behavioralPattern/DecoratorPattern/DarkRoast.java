/*
 * Copyright (c) 2022.
 * @author : Ankit Raj
 */

package com.isitneeded.behavioralPattern.DecoratorPattern;

public class DarkRoast extends Beverage{

    public DarkRoast() {
        setDescription("DarkRoast");
    }

    @Override
    public double cost() {
        return 80;
    }
}
