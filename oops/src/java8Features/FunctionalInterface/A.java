/*
 * Copyright (c) 2022.
 * @author : Ankit Raj
 */

package java8Features.FunctionalInterface;

@FunctionalInterface
public interface A {
    default void yo () {
        System.out.println("YO in A");
    }

    default void ya () {
        System.out.println("Hello ");
    }

    void print();
}
