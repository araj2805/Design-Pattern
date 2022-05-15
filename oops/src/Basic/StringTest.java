/*
 * Copyright (c) 2022.
 * @author : Ankit Raj
 */

package Basic;

import java.lang.reflect.Constructor;

public class StringTest {

    public static void main(String[] args) {

        String s1 = "Hello";
        s1.concat("Ankit");
        System.out.println(s1);

        StringBuffer sb = new StringBuffer("Ankit");
        sb.append("Raj");

        System.out.println(sb);



    }

}
