package main.java.app.remover;

import javax.swing.*;
import java.awt.*;

public class Remover extends JFrame {
    public Remover() {
        init();
    }

    private void init() {
        add(new Board());
        setSize(new Dimension(800, 600));
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Remover");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            JFrame ex = new Remover();
            ex.setVisible(true);
        });
    }
}
