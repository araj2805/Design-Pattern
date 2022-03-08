package com.isitneeded.behavioralPattern.strategyPattern;

public class MuteQuack implements QuackBehaviour{
    @Override
    public void quack() {
        System.out.println("I can't quack... Mute Quack...ahhh");
    }
}
