/*
 * Copyright (c) 2022.
 * @author : Ankit Raj
 */

package Basic;

public class StaticTest {

    static int a;
//     int a;

    public int yo () {
        a = 10;
        return a+10;
    }

    public static void main(String[] args) {
        StaticTest test = new StaticTest();

        System.out.println(test.yo());

//        System.out.println(StaticTest.yo());
    }
}
