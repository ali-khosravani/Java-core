package main.java.math;

import javax.swing.*;
import java.awt.*;

public class Calculator extends JFrame {
    public Calculator(){
        initUI();
    }

    private void initUI() {
        add(new Board());
        add(new CalcMenu());
        setResizable(false);
        setTitle("Calculator");
        setLayout(null);
        setSize(300,450);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        EventQueue.invokeLater(()->{
            JFrame ex =new Calculator();
            ex.setVisible(true);
        });
    }
}
