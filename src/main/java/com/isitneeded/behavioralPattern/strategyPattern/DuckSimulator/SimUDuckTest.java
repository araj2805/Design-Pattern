package com.isitneeded.behavioralPattern.strategyPattern.DuckSimulator;

public class SimUDuckTest {
    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        RedHeadDuck redHeadDuck = new RedHeadDuck();
        RubberDuck rubberDuck = new RubberDuck();


        mallardDuck.display();
        mallardDuck.performFly();
        mallardDuck.performQuack();

        redHeadDuck.display();
        redHeadDuck.performFly();
        redHeadDuck.performQuack();

        rubberDuck.display();
        rubberDuck.performFly();
        rubberDuck.performQuack();

        ModelDuck modelDuck = new ModelDuck();

        modelDuck.display();
        modelDuck.performFly();
        modelDuck.setFlyBehaviour(new FlyLong());
        modelDuck.performFly();
        modelDuck.performQuack();
    }
}
