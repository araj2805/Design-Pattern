package com.isitneeded.behavioralPattern.strategyPattern.DuckSimulator;

public abstract class Duck {

    // Here now these two behaviour is taking outside of superclass in order to provide it' behaviour though interface in subclass

    /*public void quack() {
        System.out.println("Quack Quack");
    }

    public void swim () {
        System.out.println("Duck is in water and swimming");
    }

    public void fly () {
        System.out.println("Duckk is flying");
    }*/

    public abstract void display();


    /*
    * Now we have take out the Behaviour which are changing over the time and added as property which it have
    *
    * */

    // Now these two Reference variable will be used to represent the flying and quack behaviour because at the runtime it'll get decided that which concrete implementation is
    // used to perform these activity.
    public FlyBehaviour flyBehaviour;
    public QuackBehaviour quackBehaviour;


    /*
    * Here I don't care what type of flying it;s going to do or what type of quack it'll do... Only thing is know that it'll do.
    * */
    public void performQuack() {
        quackBehaviour.quack();
    }

    public void performFly() {
        flyBehaviour.fly();
    }

    /*
    * Setter to set the behaviour dynamically.
    * */

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }
}
