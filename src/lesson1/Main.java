package lesson1;

import lesson2.User;
import lesson3.CreateRandom;

/**
 * Author: Ali Khosravani.
 * Date: 29-04-2023
 * Desc: First class print hello.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello Java...");
        System.out.println("Hello "+User.fullName());
        CreateRandom createRandom = new CreateRandom();
        int random =  createRandom.RandomNumber(3,20);
        System.out.println(random);
    }
}
