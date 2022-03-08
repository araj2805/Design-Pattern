package com.isitneeded.behavioralPattern.strategyPattern;

public class MallardDuck extends Duck{

    MallardDuck() {
        quackBehaviour = new Squeak();
        flyBehaviour = new FlyWithWings();
    }


    @Override
    void swim() {
        System.out.println("I can swim --> MallardDuck");
    }

    @Override
    void display() {
        System.out.println("Hello I am Mallard Duck");
    }

    @Override
    void performQuack() {
        quackBehaviour.quack();
    }

    @Override
    void performFly() {
        flyBehaviour.fly();
    }
}
