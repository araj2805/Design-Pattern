package com.isitneeded.java8Features.FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Test {
    public static void main(String[] args) {

        Square square = (a, b) -> {
            System.out.println("Providing implemetation from TEST class");
            System.out.println(a + b);
        };

        square.add(2,3);
        square.show1();
        square.show2();


        List<String> names = Arrays.asList("Geek","GeeksQuiz","g1","QA","Geek2");




    }
}
