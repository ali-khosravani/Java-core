package main.java.core;

/**
 * Declare Variable
 * Author: Ali Khosravani --2023
 */
public class DataType {
    /*
    Primitive data types -include byte 1 byte , short  2 bytes , int  4 bytes ,
     long  8 bytes, float 4 bytes, double 8 bytes, boolean 1 bit, char 2 bytes
    Non-primitive data types - such as String,Arrays ,Classes , Interface , ...
     */

    public boolean isCheckedValue() {
        return checkedValue;
    }

    public void setCheckedValue(boolean checkedValue) {
        this.checkedValue = checkedValue;
    }

    private boolean checkedValue = true;


    public void showVar() {
        int b = 150_000_122;
        long longNumber = 123_456L;
        char number = 355;
        byte c = 0b1111111;
        byte a = 0b11111111111111111111111110000001;//-127
        byte d = 0b11111111111111111111111110000101;//-123
        byte e = 0b11111111111111111111111110000111;//-121
        byte f = 0b11111111111111111111111111111111;//-1
        byte g = 0b1;//1
        System.out.println(longNumber + "\n" + number + "\n" + checkedValue +"\n" + b  + "\n" + c +  "\n" + e + "\n" + d + "\n" + a);
        System.out.println(f+g+" ");//(-1)+1=0
    }
}

class Main {
    public static void main(String[] args) {
        // byte -> short -> char -> int -> long -> float -> double
        DataType dataType = new DataType();
        dataType.showVar();
    }
}
