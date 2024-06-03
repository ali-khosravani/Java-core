package main.java.prime;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Prime p = new Prime();
        System.out.println("Please insert the number: ");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        boolean bool = p.isPrime(x);
        System.out.println(bool);
    }
}
