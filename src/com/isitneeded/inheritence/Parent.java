package com.isitneeded.inheritence;

public class Parent {

    // Normal method
     void display() {
        System.out.println("In Parent class");
    }

    /*
    *
    * Rule 2:
    * */
    // Return type changed in derived class
    // Method overriding should have method signature as it is but we can change the return type with co-variant object (Not valid for primitive data type like int , double ,float) (child class of object in child's implementation)
    Object m1 () {
        System.out.println("Method m1 : Return type is Object : Parent");
        return null;
    }

    Object m2 () {
         return "Method m2 : Return type is object in Parent";
    }

    String m3 () {
         return "Method m3 : Return type is String in Parent";
    }

}
class Child extends Parent {

    // Normal method get overriden
    void display() {
        System.out.println("In Child class");
    }

    Object m1 () {
        System.out.println("Method m1 : Return type is Object in override method : Child");
        return null;
    }


    /*
     *
     * Rule 2:
     * */
    // Here method overriding happen with co-variant return type i.e child class of parent's return type.
    String m2 () {
        return "Method m2 : Return type is String in Child";
    }

//    Object m3 () { // here it'll give me compile time exception because in parent class method have return type as String , So in child class implementation, return type must be same or child class not higher super class
//        return "Method m3 : Return type is Object in Parent";
//    }

}
