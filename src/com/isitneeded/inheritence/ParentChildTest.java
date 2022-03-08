package com.isitneeded.inheritence;

public class ParentChildTest {
    public static void main(String[] args) {

        /*
        * Overriding Rules
        * Rule 1 :
        * */

        // Here p will be reference at compile time and during runtime JVM will assign p to object of Parent class
        Parent p = new Parent();
        p.display(); // call parent method

        // Here c will be reference at compile time and during runtime JVM will assign c to object of Child class
        Child c = new Child();
        c.display(); // call child method

        // Here p will be reference at compile time and during runtime JVM do method resolution at runtime will assign p to object of Child class
        Parent p1 = new Child();
        p1.display(); // call child method, here 1 check will be done by compiler that if display method is present in Parent class or not if not then it'll throw compile time exception else during
                     // runtime parent reference will get method resolution and assign to child method if method overriding is happening.

        // If parent does not have method and reference trying to call as it's present in child class then also it'll throw comiple time exception

//        Child c4 = new Parent(); Will give compile time error


        Parent p2 = new Parent();
        p2.m1();

        Child c2 = new Child();
        c2.m1();

        Parent p3 = new Child();
        p3.m1();

        System.out.println(p2.m2());
        System.out.println(c2.m2());
        System.out.println(p3.m2());

    }
}
