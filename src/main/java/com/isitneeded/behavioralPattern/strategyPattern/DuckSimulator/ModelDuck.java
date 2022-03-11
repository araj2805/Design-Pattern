package com.isitneeded.behavioralPattern.strategyPattern.DuckSimulator;

public class ModelDuck extends Duck{


    public ModelDuck() {
        flyBehaviour = new FlyWithNoWings();
        quackBehaviour = new Quacking();
    }

    @Override
    public void display() {
        System.out.println("Hi I'm Model Duck");
    }
}
