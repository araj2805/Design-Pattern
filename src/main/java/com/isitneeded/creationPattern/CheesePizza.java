/*
 * Copyright (c) 2022.
 * @author : Ankit Raj
 */

package com.isitneeded.creationPattern;

import java.util.Arrays;

public class CheesePizza extends Pizza {

    public CheesePizza() {
        setName("Cheese");
        setDough("Wheat");
        setSauce("White Mayo tomato");
        setToppings(Arrays.asList("Garlic","Olives","Cheese"));
    }

    @Override
    public void bake() {
        System.out.println("Baking "+getName() +" Pizza at 300F  for 30 min");
    }

}
