package com.isitneeded.behavioralPattern.strategyPattern.DuckSimulator;

public class Squeak implements QuackBehaviour{
    @Override
    public void quack() {
        System.out.println("Squeak Quack");
    }
}
