/*
 * Copyright (c) 2022.
 * @author : Ankit Raj
 */

package com.isitneeded.creationPattern;

import java.util.Arrays;

public class CheeseBurst extends Pizza{

    public CheeseBurst() {
        setName("Cheese Burst");
        setDough("Maida");
        setSauce("Red Chilli");
        setToppings(Arrays.asList("Tomato","Garlic","Olives"));
    }

    @Override
    public void bake() {
        System.out.println("Baking "+getName() +" Pizza at 500F  for 30 min");
    }
}
