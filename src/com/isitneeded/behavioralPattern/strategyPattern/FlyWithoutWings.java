package com.isitneeded.behavioralPattern.strategyPattern;

public class FlyWithoutWings implements FlyBehaviour{
    @Override
    public void fly() {
        System.out.println("I can't fly... ahhh");
    }
}
