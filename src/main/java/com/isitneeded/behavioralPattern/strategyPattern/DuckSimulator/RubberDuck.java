package com.isitneeded.behavioralPattern.strategyPattern.DuckSimulator;

public class RubberDuck extends Duck /*implements FlyBehaviour, QuackBehaviour*/ {

    public RubberDuck() {
        flyBehaviour = new FlyWithNoWings();
        quackBehaviour = new Quacking();
    }

    @Override
    public void display() {
        System.out.println("I'm RubberDuck");
    }

/*
* Rubber Duck cannot fly, So providing no implementation by overriding it
* */
    /*@Override
    public void fly() {
        System.out.println("Cannot fly I'm rubber");
    }

    @Override
    public void quack() {
        System.out.println("Quack Quack in Rubber");
    }*/
}
