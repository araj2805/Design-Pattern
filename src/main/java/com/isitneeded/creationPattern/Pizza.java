/*
 * Copyright (c) 2022.
 * @author : Ankit Raj
 */

package com.isitneeded.creationPattern;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {

    String name;
    String dough;
    String sauce;
    List<String> toppings = new ArrayList<>();

    void prepare() {
        System.out.println("Preparing Pizza : "+name);
        System.out.println("Tossing "+dough+" dough....");
        System.out.println("Adding "+sauce+" sauce...");
        System.out.println("Adding Topping : ");
        toppings.stream().forEach(topping -> System.out.println(topping + " Topping"));
    }
    void bake() {
        System.out.println("Baking Pizza for 25 min at 350F");
    }
    void cut() {
        System.out.println("Cutting Pizza into 4 Pieces");
    }
    void box() {
        System.out.println("Boxing Pizza, Ready for delivery");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDough() {
        return dough;
    }

    public void setDough(String dough) {
        this.dough = dough;
    }

    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public List<String> getToppings() {
        return toppings;
    }

    public void setToppings(List<String> toppings) {
        this.toppings = toppings;
    }
}
