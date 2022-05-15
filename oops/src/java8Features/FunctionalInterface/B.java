/*
 * Copyright (c) 2022.
 * @author : Ankit Raj
 */

package java8Features.FunctionalInterface;

@FunctionalInterface
public interface B {
    default void yo () {
        System.out.println("YO in A");
    }

    void print();
}
