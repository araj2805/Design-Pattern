/*
 * Copyright (c) 2022.
 * @author : Ankit Raj
 */

package com.isitneeded.creationPattern;

import java.util.Arrays;

public class PatnaStylePepperoniPizza extends Pizza {
    public PatnaStylePepperoniPizza() {
        setName("Patna Pepperoni");
        setDough("Maida");
        setSauce("Red Chilli");
        setToppings(Arrays.asList("Tomato","Garlic","Olives","Cheese"));
    }

    @Override
    public void bake() {
        System.out.println("Baking "+getName() +" Pizza at 300F  for 30 min");
    }
}
