package com.isitneeded.behavioralPattern.strategyPattern.DuckSimulator;

public class MuteQuack implements QuackBehaviour{
    @Override
    public void quack() {
        System.out.println("Silence Quack");
    }
}
