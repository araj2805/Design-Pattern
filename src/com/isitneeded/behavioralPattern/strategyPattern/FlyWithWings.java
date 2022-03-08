package com.isitneeded.behavioralPattern.strategyPattern;

public class FlyWithWings implements FlyBehaviour{
    @Override
    public void fly() {
        System.out.println("I can fly... Hahahahha");
    }
}
