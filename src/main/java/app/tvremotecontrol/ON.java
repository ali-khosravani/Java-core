package main.java.tvremotecontrol;

public class ON implements RemoteControl {
    public static ON INSTANCE = new ON();
    private ON(){

    }
    @Override
    public void switchState(TV tv) {
        System.out.println("TV is now on ...");
        tv.setState(OFF.INSTANCE);
        System.out.println("TV is turn off ...");
    }
}
