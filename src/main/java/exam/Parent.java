package main.java.exam;

public class Parent {
    static void display(){
        System.out.println("Parent ");
    }
}
class Child extends Parent{
    static void display(){
        System.out.println("Child ");
    }
}
class app{
    public static void main(String[] args) {
        Parent.display();
        Child.display();
        Parent.display();
    }
}
