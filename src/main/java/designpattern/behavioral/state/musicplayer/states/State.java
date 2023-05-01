package main.java.designpattern.behavioral.state.musicplayer.states;

import main.java.designpattern.behavioral.state.musicplayer.ui.Player;

public abstract class State {
    Player player;

    State(Player player){
        this.player=player;
    }
    public abstract String onLock();
    public abstract String onPlay();
    public abstract String onNext();
    public abstract String onPrevious();
}
