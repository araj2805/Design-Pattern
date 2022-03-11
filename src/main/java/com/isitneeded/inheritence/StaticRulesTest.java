package com.isitneeded.inheritence;

public class StaticRulesTest {
    public static void main(String[] args) {

        /*-----------------------------------------------------------------------------------------------------------------------------------------*/
        /*
         * Rule 6: Method hiding
         * */

        /*
         * Parent(METHOD)    static        non static        static
         *                     |              |                |
         *                  can't be       can't be          can be (Method hidding it's not method overriding)
         *                     |              |                |
         * Child           non static      static           static
         * (OVERRIDING METHOD) here when both Parent and Child have static method then reference can resolve method at compile time (not at runtime as usually happen in overriding)
         * */

        A a = new A();
        a.m3();

        B b = new B();
        b.m3();

        A a1 = new B();
        a1.m3(); // Here a1 is reference variable and m3() method is static in both Parent and child class so, method hidding happen,
                // So no Overriding happen then a1 will resolve method at compile time i.e. parent class's static method.
    }
}
