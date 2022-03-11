package com.isitneeded.java8Features.FunctionalInterface;

@FunctionalInterface
public interface A {
    default void yo () {
        System.out.println("YO in A");
    }

    void print();
}
