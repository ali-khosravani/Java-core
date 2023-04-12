package main.java.prime;

import java.util.Scanner;

public class Prime {

    public  boolean isPrime(int x) {
        boolean flag= false;
        for (int i = 2; i < x; i++) {
            if (x % i == 0){
                flag =false;
                break;
            }
            flag =true;
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
