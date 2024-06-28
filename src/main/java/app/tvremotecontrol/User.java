package main.java.app.tvremotecontrol;

public class User {
    public static void main(String[] args) {
        TV tv = new TV(OFF.INSTANCE);
        tv.togglePower();
        tv.togglePower();
    }
}
