package com.isitneeded.behavioralPattern.strategyPattern;

public class Squeak implements QuackBehaviour{
    @Override
    public void quack() {
        System.out.println("Squeak Squeak Squeak");
    }
}
