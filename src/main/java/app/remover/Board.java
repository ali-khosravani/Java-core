package main.java.app.remover;

import javax.swing.*;
import java.awt.*;

public class Board extends JPanel {
    public Board(){
        initBoard();
    }

    private void initBoard() {
        JTextField jtfUserName = new JTextField();
        jtfUserName.setEditable(true);
        jtfUserName.setColumns(50);
        jtfUserName.setText("UserName");
        JTextField jtfPassword = new JTextField();
        jtfPassword.setEditable(true);
        jtfPassword.setColumns(50);
        jtfPassword.setText("Password");
        JTextField jtfServer = new JTextField();
        jtfServer.setEditable(true);
        jtfServer.setColumns(50);
        jtfServer.setText("Server");

        setFocusable(true);
        setPreferredSize(new Dimension(800,600));

        JButton jBtnRemove = new JButton("Remove");
        JButton jBtnConnect =new JButton("Connect");
        JButton jBtnExit =new JButton("Exit");

        JPanel jPanelContext = new JPanel();
        JPanel buttons = new JPanel(new FlowLayout(FlowLayout.CENTER));

        buttons.add(jBtnConnect);
        buttons.add(jBtnExit);
        buttons.add(jBtnRemove);

        add(jPanelContext);
        add(jtfUserName);
        add(jtfPassword);
        add(jtfServer);
        add(buttons);

    }
}
