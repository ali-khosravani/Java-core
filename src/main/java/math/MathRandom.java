package main.java.math;

/**
 * Author: Ali Khosravani
 * Date: 2023-04-30
 * Desc: Create Random number between 2 number.
 */
public class MathRandom {
    public int RandomNumber(int a, int b){
        int random_number = (int)(Math.random()*(b-a+1)+a);
        return random_number;
    }

    public static void main(String[] args) {
        if (10<5) {
            System.out.println(Math.min(15, 20));
        }
        else if (10 == 5){
            System.out.println((int)Math.sqrt(4));
        }
        else {
            System.out.println(Math.abs(-23));
        }
    }
}
