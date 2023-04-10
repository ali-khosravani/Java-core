package main.java.math;

import javax.swing.*;
import java.awt.*;

public class Calculator extends JFrame {
    public Calculator(){
        initUI();
    }

    private void initUI() {
        add(new Board());
        setTitle("Calculator");
        setSize(300,450);


        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(()->{
            JFrame ex = new Calculator();
            ex .setVisible(true);
        });
    }
}
