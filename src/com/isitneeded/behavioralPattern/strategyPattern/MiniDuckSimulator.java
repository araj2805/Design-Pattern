package com.isitneeded.behavioralPattern.strategyPattern;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallockDuck = new MallardDuck();
        mallockDuck.display();
        mallockDuck.swim();
        mallockDuck.performFly();
        mallockDuck.performQuack();
        mallockDuck.setFlyBehaviour(new FlyWithoutWings());
        mallockDuck.performFly();
    }
}
