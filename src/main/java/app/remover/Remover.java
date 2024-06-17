package main.java.app.remover;

import javax.swing.*;
import java.awt.*;

public class Remover extends JFrame {
    public Remover() {
        init();
    }

    private void init() {
        add(new Board());
        pack();
        setResizable(false);
        setTitle("Remove Program");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            JFrame ex = new Remover();
            ex.setVisible(true);
        });
    }
}
