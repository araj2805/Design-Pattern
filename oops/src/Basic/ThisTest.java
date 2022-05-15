/*
 * Copyright (c) 2022.
 * @author : Ankit Raj
 */

package Basic;

public class ThisTest {
    public ThisTest() {
        System.out.println("Yo");
    }

    public ThisTest(int a) {
        this();
        System.out.println(a);

    }

    public static void main(String[] args) {
        ThisTest t = new ThisTest(10);
    }
}
