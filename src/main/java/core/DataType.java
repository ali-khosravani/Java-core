package main.java.core;

/**
 * Declare Variable
 * Author: Ali Khosravani --2023
 */
public class DataType {
    /*
    Primitive data types -include byte 1 byte , short  2 bytes , int  4 bytes ,
     long  8 bytes, float 4 bytes, double 8 bytes, boolean 1 bit, char 2 bytes
    Non-primitive data types - such as String,Arrays ,Classes , Interface
     */

    public boolean isCheckedValue() {
        return checkedValue;
    }

    public void setCheckedValue(boolean checkedValue) {
        this.checkedValue = checkedValue;
    }

    private boolean checkedValue = true;


    private void showVar(){
        long longNumber = 123456;
        char number = 327;
        System.out.println(longNumber +"\n"+number +"\n"+ checkedValue);
    }
    public static void main(String[] args) {
        // byte -> short -> char -> int -> long -> float -> double
        DataType dataType = new DataType();
        dataType.showVar();
    }
}
