package com.isitneeded.behavioralPattern.strategyPattern.DuckSimulator;

public class FlyLong implements FlyBehaviour{
    @Override
    public void fly() {
        System.out.println("Flying Very long distance... Yay");
    }
}
