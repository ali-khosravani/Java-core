package main.java.tvremotecontrol;

public class OFF implements RemoteControl {
    public static OFF INSTANCE = new OFF();

    private OFF() {
    }

    @Override
    public void switchState(TV tv) {
        System.out.println("TV is now OFF ...");
        tv.setState(ON.INSTANCE);
        System.out.println("TV is turn on ...");
    }
}
