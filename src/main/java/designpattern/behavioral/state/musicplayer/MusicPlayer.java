package main.java.designpattern.behavioral.state.musicplayer;

import main.java.designpattern.behavioral.state.musicplayer.ui.Player;
import main.java.designpattern.behavioral.state.musicplayer.ui.UI;

public class MusicPlayer {
    public static void main(String[] args) {
        Player player =new Player();
        UI ui =new UI(player);
        ui.init();
    }
}
