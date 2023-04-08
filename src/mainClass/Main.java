package mainClass;

import inheritClass.User;
import mathClass.MathClass;

/**
 * Author: Ali Khosravani.
 * Date: 29-04-2023
 * Desc: First class print hello.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello Java...");
        System.out.println("Hello "+User.fullName());
        MathClass createRandom = new MathClass();
        int random =  createRandom.RandomNumber(3,20);
        int shortIf = random<10? random:random-20;
        System.out.println(shortIf);
    }
}
