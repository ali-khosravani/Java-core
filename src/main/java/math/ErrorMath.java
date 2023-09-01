package main.java.math;

import main.java.exception.Error;

public class ErrorMath {
    public static void main(String[] args) {

        try{
            throw new Error("Can not divide to string", 123);
        }
        catch (Error e){
            System.out.println(e.getCode() + " " +e.getMessage());
        }
    }
}
