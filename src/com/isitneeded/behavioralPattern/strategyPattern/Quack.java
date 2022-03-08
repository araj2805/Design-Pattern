package com.isitneeded.behavioralPattern.strategyPattern;

public class Quack implements QuackBehaviour{
    @Override
    public void quack() {
        System.out.println("Quack Quack Quack");
    }
}
