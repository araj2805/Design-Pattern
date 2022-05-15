/*
 * Copyright (c) 2022.
 * @author : Ankit Raj
 */

package com.isitneeded.creationPattern;

import java.util.Arrays;

public class BlrStylePepperoniPizza extends Pizza {

    public BlrStylePepperoniPizza() {
        setName("BLR Pepperoni");
        setDough("Soft crust");
        setSauce("Yellow tomato");
        setToppings(Arrays.asList("Tomato","Garlic","Olives","Cheese"));
    }

    @Override
    public void bake() {
        System.out.println("Baking "+getName() +" Pizza at 300F  for 30 min");
    }
}
