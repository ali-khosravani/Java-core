package main.java.math;

import java.util.Scanner;

public class DivideZero {
    public static void main(String[] args) {
        int i = 10;
        int value;
        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();
        try {
            value = i / userInput;
            System.out.println(value);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }
}
