package main.java.math;

import main.java.exception.DivideZeroException;

public class DivideZero {
    public static void main(String[] args){
        int num1 = 10;
        int num2 = 0;
        int num3 ;
        try {
            if (num2 ==0){
                throw new DivideZeroException("Error: Cannot divide a number by zero");
            }
            num3 = num1 / num2;
            System.out.println(num3);
        }
        catch (DivideZeroException e){
            System.out.println(e.getMessage());
        }
    }

}
