/*
 * Copyright (c) 2022.
 * @author : Ankit Raj
 */

package com.isitneeded.behavioralPattern.strategyPattern.ActionAdventureGame;

public class Knight extends Character{
    @Override
    public void display() {
        System.out.println("I'm Knight");
    }

    public Knight() {
        weaponBehaviour = new AxeBehaviour();
    }
}
