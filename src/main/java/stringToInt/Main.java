package main.java.stringToInt;

public class Main implements StringToInt{
    @Override
    public String stringToInt(String s) {
        return s;
    }

    @Override
    public Integer stringToInteger(String s) {
        return s.length();
    }
    public static void main(String[] args) {
        Main main = new Main();
        String s = "Hello from java....";
        System.out.println(main.stringToInt(s));
        System.out.println(main.stringToInteger(s));
    }
}
