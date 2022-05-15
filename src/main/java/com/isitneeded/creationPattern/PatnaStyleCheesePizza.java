/*
 * Copyright (c) 2022.
 * @author : Ankit Raj
 */

package com.isitneeded.creationPattern;

import java.util.Arrays;

public class PatnaStyleCheesePizza extends Pizza {
    public PatnaStyleCheesePizza() {
        setName("Patna Cheese");
        setDough("Heavy loaded Cheese");
        setSauce("Red tomato");
        setToppings(Arrays.asList("Tomato","Garlic","Olives","Cheese"));
    }

    @Override
    public void bake() {
        System.out.println("Baking "+getName() +" Pizza at 300F  for 30 min");
    }
}
