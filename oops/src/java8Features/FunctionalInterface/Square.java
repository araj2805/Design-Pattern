/*
 * Copyright (c) 2022.
 * @author : Ankit Raj
 */

package java8Features.FunctionalInterface;

@FunctionalInterface
public interface Square {

    default void show1() {
        System.out.println("Hi show1");
    }

    default void show2() {
        System.out.println("Hi show2");
    }

    void add (int a, int b);



}
