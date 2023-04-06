package lesson4;

public class Singleton {
    private static  Singleton instance= new Singleton();

    private Singleton(){}
    public static synchronized Singleton getInstance(){
        return instance;
    }
}
class Single{
    public static void main(String[] args) {
        Singleton x = Singleton.getInstance();
        Singleton y = Singleton.getInstance();
        Singleton z = Singleton.getInstance();

        System.out.println("x is : "+ x.hashCode());
        System.out.println("y is : "+ y.hashCode());
        System.out.println("z is : "+ z.hashCode());
    }
}
