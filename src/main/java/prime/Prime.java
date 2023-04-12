package main.java.prime;

import java.util.Scanner;

public class Prime {
    public boolean isPrime(int x) {
        boolean flag= true;
        for (int i = 2; i <(int) Math.sqrt(x)+1; i++) {
            if (x % i == 0){
                flag =false;
                break;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        Prime prime = new Prime();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert the number: ");
        int x = scanner.nextInt();
        boolean bool =prime.isPrime(x);
        System.out.println(bool);
    }
}
