package main.java.math.calculator;

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
        setSize(290,395);
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
