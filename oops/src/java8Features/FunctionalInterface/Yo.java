/*
 * Copyright (c) 2022.
 * @author : Ankit Raj
 */

package java8Features.FunctionalInterface;

public class Yo implements A,B{

    @Override
    public void yo() {
        A.super.yo();
    }

    @Override
    public void print() {

    }


    A a = () -> System.out.println("Hello A");
}
