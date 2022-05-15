/*
 * Copyright (c) 2022.
 * @author : Ankit Raj
 */

package Basic;

public class OverridingTest {
}

class A {
    public static void show () {
        System.out.println("In A Show");
    }
}

class B extends A{
    public static void show () {
        System.out.println("In B Show");
    }
}

class C {
    public static void main(String[] args) {
        B a = new B();
        a.show();
    }
}
