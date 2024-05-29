package main.java.core;

import java.util.stream.IntStream;

import static java.util.stream.IntStream.*;

public class LoopClass {
    //while , do while , for , for -each

    public static void main(String[] args) {
        //foreach
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int i : numbers) {
            sum += i;
        }
        System.out.println(sum);

        range(0, 6).filter(i -> i != 3).takeWhile(i -> i != 5).forEach(System.out::println);
//        range(0, 6).filter(i -> i != 3).forEach(i -> System.out.println(i));
    }

}
