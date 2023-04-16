package main.java.game.snake;

import javax.swing.*;
import java.awt.*;

public class Snake extends JFrame {
    public Snake(){
        initUI();
    }

    private void initUI() {
        add(new Board());
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(()->{
            JFrame ex =new Snake();
            ex.setVisible(true);
        });
    }
}
