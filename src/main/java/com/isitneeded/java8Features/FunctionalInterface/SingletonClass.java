package com.isitneeded.java8Features.FunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SingletonClass {

    private static SingletonClass singletonClass = null;

    String s;

    private SingletonClass() {
        s = "Hi I'm Signleton memeber variable";
    }

    public static SingletonClass SingletonClass() {

        if (singletonClass == null)
            return new SingletonClass();

        return singletonClass;
    }

}

class Main {
    public static void main(String[] args) {

        List<Integer> num = new ArrayList<>(Arrays.asList(1,0));

        try {

            for (int i : num) {
                if (i == 0)
                    break;
                int teemp = 5 / i;

                System.out.println(teemp);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }


        SingletonClass a = SingletonClass.SingletonClass();
        SingletonClass b = SingletonClass.SingletonClass();
        SingletonClass c = SingletonClass.SingletonClass();

        System.out.println("a  hashcode " + a.hashCode());
        System.out.println("b  hashcode " + b.hashCode());
        System.out.println("c  hashcode " + c.hashCode());

        a.s = a.s.toUpperCase();

        System.out.println("String from x is " + a.s);
        System.out.println("String from y is " + b.s);
        System.out.println("String from z is " + c.s);
        System.out.println("\n");

        System.out.println();
    }
}
