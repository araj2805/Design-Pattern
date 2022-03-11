package com.isitneeded.behavioralPattern.strategyPattern.DuckSimulator;

// So now Concrete Duck Subclass don't know how to fly or quack directly. Parent Duck class have reference for behaviour and child class will use it do perform these operation.

public class MallardDuck extends Duck /*implements FlyBehaviour, QuackBehaviour*/ {
    @Override
    public void display() {
        System.out.println("I'm mallard duck");
    }

    // THese method are now move out of duck class and will be presented by duck class
    /*@Override
    public void fly() {
        System.out.println("Low flying");
    }

    @Override
    public void quack() {
        System.out.println("Squeaking");
    }*/

    public MallardDuck() {
        flyBehaviour = new FlyLong();
        quackBehaviour = new Quacking();
    }
}
