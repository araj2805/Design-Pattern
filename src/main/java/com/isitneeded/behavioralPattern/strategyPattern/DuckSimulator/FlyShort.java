package com.isitneeded.behavioralPattern.strategyPattern.DuckSimulator;

public class FlyShort implements FlyBehaviour{
    @Override
    public void fly() {
        System.out.println("Flying Short flight");
    }
}
