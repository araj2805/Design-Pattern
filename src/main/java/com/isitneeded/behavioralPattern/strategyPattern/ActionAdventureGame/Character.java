/*
 * Copyright (c) 2022.
 * @author : Ankit Raj
 */

package com.isitneeded.behavioralPattern.strategyPattern.ActionAdventureGame;

public abstract class  Character {
    public WeaponBehaviour weaponBehaviour;

    public abstract void display();

    public void setWeaponBehaviour(WeaponBehaviour weaponBehaviour) {
        this.weaponBehaviour = weaponBehaviour;
    }

    public void attack () {
        weaponBehaviour.useWeapon();
    }
}
