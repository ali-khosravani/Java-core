package javaConcept;

/**
 * JavaDoc
 * Author: Ali Khosravani
 * Date: 2023-04-08
 * Desc: Declare variable
 */
public class Variable {
    //single comment
    /*
    multi line comment
     */
    public static void main(String[] args) {
        //final is read only variable and don't overwrite existing value
        String str = "Ali Khosravani";
        // Special character \'  \" \\   and \n \r \t \b \f
        System.out.println(str.toLowerCase().concat(str.toUpperCase()));
        int number = 10;
        final int numberFinal = 25;
        float numberFlout = 10.25f;
        char myChar = 'a';
        boolean bool = true;
        System.out.println(bool);

        // Operator + - * / % ++ --
        number++;
        System.out.println(number);

    }
}
