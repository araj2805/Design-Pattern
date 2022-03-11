package com.isitneeded.behavioralPattern.strategyPattern.DuckSimulator;

public class Quacking implements QuackBehaviour{
    @Override
    public void quack() {
        System.out.println("Quack Quack Quack !!!!!!!!!!");
    }
}
