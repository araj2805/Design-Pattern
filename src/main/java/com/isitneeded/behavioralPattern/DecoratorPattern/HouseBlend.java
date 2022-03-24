/*
 * Copyright (c) 2022.
 * @author : Ankit Raj
 */

package com.isitneeded.behavioralPattern.DecoratorPattern;

public class HouseBlend extends Beverage{

    public HouseBlend() {
        setDescription("HouseBlend");
    }

    public HouseBlend(Size size) {
        setDescription("HouseBlend Size : "+ size.name());
        setSize(size);
    }

    @Override
    public double cost() {
        return 60;
    }
}
