package main.java.core;

import java.util.Scanner;

public class BooleanClass {
    public static void main(String[] args) {
        int x ;
        int y ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert the X : ");
        x = scanner.nextInt();
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Please insert the Y : ");
        y = scanner1.nextInt();
        String s = (x > y) ? "True" : "False";
        System.out.println("X Great than Y is "+ s);
    }
}
