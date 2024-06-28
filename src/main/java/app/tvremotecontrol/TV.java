package main.java.app.tvremotecontrol;

public class TV {
    private RemoteControl state;
    public TV(RemoteControl state) {
        this.state = state;
    }

    public void setState(RemoteControl state) {
        this.state = state;
    }

    public void togglePower(){
        state.switchState(this);
        System.out.println("-------------------------------");
    }
}
