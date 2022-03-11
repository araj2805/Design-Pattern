/*
 * Copyright (c) 2022.
 * @author : Ankit Raj
 */

package com.isitneeded.behavioralPattern.strategyPattern.ActionAdventureGame;

public class King extends Character{
    @Override
    public void display() {
        System.out.println("I'm King");
    }

    public King() {
        weaponBehaviour = new SwordBehaviour();
    }
}
