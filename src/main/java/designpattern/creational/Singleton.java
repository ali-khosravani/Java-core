package main.java.designpattern.creational;

public class Singleton {

    private Singleton() {
    }

    private static final class InstanceHolder {
        private static final Singleton instance = new Singleton();
    }

    public static Singleton getInstance() {
        return InstanceHolder.instance;
    }

    public static void main(String[] args) {
        Singleton x = Singleton.getInstance();
        Singleton y = Singleton.getInstance();
        System.out.println(x.hashCode() + "  " + y.hashCode());
    }
}
