package com.isitneeded.behavioralPattern.strategyPattern.DuckSimulator;

public class FlyWithNoWings implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("Can't fly.... No wings");
    }
}
