package main.java.math;

import main.java.exception.ErrorHandel;

public class ErrorMath {
    public static void main(String[] args) {

        try{
            throw new ErrorHandel(123, "Can not divide to string");
        }
        catch (ErrorHandel e){
            System.out.println(e.getCode() + " " +e.getMessage());
        }
    }
}
