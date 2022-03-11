/*
 * Copyright (c) 2022.
 * @author : Ankit Raj
 */

package com.isitneeded.behavioralPattern.strategyPattern.ActionAdventureGame;

public class AdventureGameTest {
    public static void main(String[] args) {
        Character king  = new King();


        king.attack();
        king.setWeaponBehaviour(new KnifeBehaviour());
        king.attack();
    }
}
