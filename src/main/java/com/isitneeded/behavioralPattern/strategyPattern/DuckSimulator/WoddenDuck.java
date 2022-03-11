package com.isitneeded.behavioralPattern.strategyPattern.DuckSimulator;

public class WoddenDuck extends Duck /*implements FlyBehaviour, QuackBehaviour*/ {
    @Override
    public void display() {
        System.out.println("I'm wooden Duck");
    }

    public WoddenDuck() {
        flyBehaviour = new FlyWithNoWings();
        quackBehaviour = new MuteQuack();
    }

    /*@Override
    public void fly() {

    }

    @Override
    public void quack() {

    }*/

    /*
    *
    * Wooden duck cannot fly and quack, so overriding it to not provide implementation -- when superclass have behaviour
    * */
    /*@Override
    public void quack() {

    }

    @Override
    public void fly() {

    }*/
}
