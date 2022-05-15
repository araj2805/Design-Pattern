/*
 * Copyright (c) 2022.
 * @author : Ankit Raj
 */

package java8Features.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tryout {
    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(123);
        list.add(2234);
        list.add(1);
        list.add(9);
        list.add(3);
        list.add(54);
        list.add(23);
        list.add(89);
        list.add(40);


        list.stream().filter(i -> i > 20).sorted().forEach(integer -> System.out.print(integer+" "));


    }
}
