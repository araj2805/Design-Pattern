/*
 * Copyright (c) 2022.
 * @author : Ankit Raj
 */

package com.isitneeded.behavioralPattern.strategyPattern.ActionAdventureGame;

public class Queen extends Character{
    @Override
    public void display() {
        System.out.println("I'm Queen");
    }

    public Queen() {
        weaponBehaviour = new KnifeBehaviour();
    }
}
