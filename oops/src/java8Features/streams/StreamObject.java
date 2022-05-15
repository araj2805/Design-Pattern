/*
 * Copyright (c) 2022.
 * @author : Ankit Raj
 */

package java8Features.streams;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {

    public static void main(String[] args) {


        Stream<Object> stream = Stream.empty();

        String names[] = {"Ankit","Raj","Aman"};

        Stream<String> stringStream = Stream.of(names);
        stringStream.forEach(System.out::print);

        Stream<Object> build = Stream.builder().build();


        Stream stream1 = (Stream) Arrays.stream(new int[]{12, 24, 42});
    }
}
