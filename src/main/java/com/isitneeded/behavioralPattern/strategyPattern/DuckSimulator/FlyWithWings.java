package com.isitneeded.behavioralPattern.strategyPattern.DuckSimulator;

public class FlyWithWings implements FlyBehaviour{
    @Override
    public void fly() {
        System.out.println("Flying with Wings..........");
    }
}
