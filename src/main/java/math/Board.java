package main.java.math;

import javax.swing.*;
import java.awt.*;

public class Board extends JPanel {
    public Board(){
        initBoard();
    }

    private void initBoard() {
        setBackground(new Color(200,200,255));
        setLayout(null);
        setBounds(0,20,300,450);
    }
}


