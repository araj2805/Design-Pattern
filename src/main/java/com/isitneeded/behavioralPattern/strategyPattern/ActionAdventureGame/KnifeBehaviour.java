/*
 * Copyright (c) 2022.
 * @author : Ankit Raj
 */

package com.isitneeded.behavioralPattern.strategyPattern.ActionAdventureGame;

public class KnifeBehaviour implements WeaponBehaviour{
    @Override
    public void useWeapon() {
        System.out.println("Knife Attack");
    }
}
