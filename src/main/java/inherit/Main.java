package main.java.inherit;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.setFirstName("Ali");
        user.setLastName("Khosravani");
        System.out.println(user.fullName());
    }
}
