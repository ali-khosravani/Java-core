package main.java.math.calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Board extends JPanel implements ActionListener {
    JTextArea ta;
    JButton jButton1, jButton2, jButton3, jButton4, jButton5, jButton6, jButton7, jButton8, jButton9, jButton0, jButtonDot;
    JButton jButtonMC, jButtonMR, jButtonMS, jButtonMPlus, jButtonMMinus, jButtonCE, jButtonC;
    JButton jButtonBack, jButtonPlusMinus, jButtonSqrt, jButtonPlus, jButtonMinus, jButtonMultiplication, jButtonDivision, jButtonPercent, jButtonEqual, jButton1DivX;

    public Board() {
        initBoard();
    }

    private void initBoard() {
        setBackground(new Color(230, 230, 255));
        setLayout(null);
        setBounds(0, 20, 290, 450);

        ta = new JTextArea();
        ta.setBounds(10, 10, 270, 70);
        ta.setVisible(true);
        ta.setLineWrap(true);
        ta.setText("0");
        add(ta);


        jButtonMC = new JButton("MC");
        jButtonMC.setBounds(10, 90, 50, 35);
        jButtonMC.setMargin(new Insets(0, 0, 0, 0));

        jButtonMR = new JButton("MR");
        jButtonMR.setBounds(65, 90, 50, 35);
        jButtonMR.setMargin(new Insets(0, 0, 0, 0));

        jButtonMS = new JButton("MS");
        jButtonMS.setBounds(120, 90, 50, 35);
        jButtonMS.setMargin(new Insets(0, 0, 0, 0));

        jButtonMPlus = new JButton("M+");
        jButtonMPlus.setBounds(175, 90, 50, 35);
        jButtonMPlus.setMargin(new Insets(0, 0, 0, 0));

        jButtonMMinus = new JButton("M-");
        jButtonMMinus.setBounds(230, 90, 50, 35);
        jButtonMMinus.setMargin(new Insets(0, 0, 0, 0));


        jButtonBack = new JButton("Back");
        jButtonBack.setBounds(10, 130, 50, 35);
        jButtonBack.setMargin(new Insets(0, 0, 0, 0));

        jButtonCE = new JButton("CE");
        jButtonCE.setBounds(65, 130, 50, 35);
        jButtonCE.setMargin(new Insets(0, 0, 0, 0));

        jButtonC = new JButton("C");
        jButtonC.setBounds(120, 130, 50, 35);
        jButtonC.setMargin(new Insets(0, 0, 0, 0));

        jButtonPlusMinus = new JButton("+/-");
        jButtonPlusMinus.setBounds(175, 130, 50, 35);
        jButtonPlusMinus.setMargin(new Insets(0, 0, 0, 0));

        jButtonSqrt = new JButton("sqrt");
        jButtonSqrt.setBounds(230, 130, 50, 35);
        jButtonSqrt.setMargin(new Insets(0, 0, 0, 0));


        jButton7 = new JButton("7");
        jButton7.setBounds(10, 170, 50, 35);
        jButton7.setMargin(new Insets(0, 0, 0, 0));

        jButton8 = new JButton("8");
        jButton8.setBounds(65, 170, 50, 35);
        jButton8.setMargin(new Insets(0, 0, 0, 0));

        jButton9 = new JButton("9");
        jButton9.setBounds(120, 170, 50, 35);
        jButton9.setMargin(new Insets(0, 0, 0, 0));

        jButtonDivision = new JButton("/");
        jButtonDivision.setBounds(175, 170, 50, 35);
        jButtonDivision.setMargin(new Insets(0, 0, 0, 0));

        jButtonPercent = new JButton("%");
        jButtonPercent.setBounds(230, 170, 50, 35);
        jButtonPercent.setMargin(new Insets(0, 0, 0, 0));


        jButton4 = new JButton("4");
        jButton4.setBounds(10, 210, 50, 35);
        jButton4.setMargin(new Insets(0, 0, 0, 0));

        jButton5 = new JButton("5");
        jButton5.setBounds(65, 210, 50, 35);
        jButton5.setMargin(new Insets(0, 0, 0, 0));

        jButton6 = new JButton("6");
        jButton6.setBounds(120, 210, 50, 35);
        jButton6.setMargin(new Insets(0, 0, 0, 0));

        jButtonMultiplication = new JButton("*");
        jButtonMultiplication.setBounds(175, 210, 50, 35);
        jButtonMultiplication.setMargin(new Insets(0, 0, 0, 0));

        jButton1DivX = new JButton("1/x");
        jButton1DivX.setBounds(230, 210, 50, 35);
        jButton1DivX.setMargin(new Insets(0, 0, 0, 0));


        jButton1 = new JButton("1");
        jButton1.setBounds(10, 250, 50, 35);
        jButton1.setMargin(new Insets(0, 0, 0, 0));

        jButton2 = new JButton("2");
        jButton2.setBounds(65, 250, 50, 35);
        jButton2.setMargin(new Insets(0, 0, 0, 0));

        jButton3 = new JButton("3");
        jButton3.setBounds(120, 250, 50, 35);
        jButton3.setMargin(new Insets(0, 0, 0, 0));

        jButtonMinus = new JButton("-");
        jButtonMinus.setBounds(175, 250, 50, 35);
        jButtonMinus.setMargin(new Insets(0, 0, 0, 0));

        jButtonEqual = new JButton("=");
        jButtonEqual.setBounds(230, 250, 50, 75);
        jButtonEqual.setMargin(new Insets(0, 0, 0, 0));


        jButton0 = new JButton("0");
        jButton0.setBounds(10, 290, 105, 35);
        jButton0.setMargin(new Insets(0, 0, 0, 0));

        jButtonDot = new JButton(".");
        jButtonDot.setBounds(120, 290, 50, 35);
        jButtonDot.setMargin(new Insets(0, 0, 0, 0));

        jButtonPlus = new JButton("+");
        jButtonPlus.setBounds(175, 290, 50, 35);
        jButtonPlus.setMargin(new Insets(0, 0, 0, 0));


        add(jButtonMC);
        jButtonMC.addActionListener(this);
        add(jButtonMR);
        jButtonMR.addActionListener(this);
        add(jButtonMS);
        jButtonMS.addActionListener(this);
        add(jButtonMPlus);
        jButtonMPlus.addActionListener(this);
        add(jButtonMMinus);
        jButtonMinus.addActionListener(this);

        add(jButtonBack);
        jButtonBack.addActionListener(this);
        add(jButtonCE);
        jButtonCE.addActionListener(this);
        add(jButtonC);
        jButtonC.addActionListener(this);
        add(jButtonPlusMinus);
        jButtonPlusMinus.addActionListener(this);
        add(jButtonSqrt);
        jButtonSqrt.addActionListener(this);


        add(jButton7);
        jButton7.addActionListener(this);
        add(jButton8);
        jButton8.addActionListener(this);
        add(jButton9);
        jButton9.addActionListener(this);
        add(jButtonDivision);
        jButtonDivision.addActionListener(this);
        add(jButtonPercent);
        jButtonPercent.addActionListener(this);


        add(jButton4);
        jButton4.addActionListener(this);
        add(jButton5);
        jButton5.addActionListener(this);
        add(jButton6);
        jButton6.addActionListener(this);
        add(jButtonMultiplication);
        jButtonMultiplication.addActionListener(this);
        add(jButton1DivX);
        jButton1DivX.addActionListener(this);


        add(jButton1);
        jButton1.addActionListener(this);
        add(jButton2);
        jButton2.addActionListener(this);
        add(jButton3);
        jButton3.addActionListener(this);
        add(jButtonMinus);
        jButtonMinus.addActionListener(this);
        add(jButtonEqual);
        jButtonEqual.addActionListener(this);

        add(jButton0);
        jButton0.addActionListener(this);
        add(jButtonDot);
        jButtonDot.addActionListener(this);
        add(jButtonPlus);
        jButtonPlus.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if (obj == jButton0) {
            if (ta.getText()=="0"){
                ta.setText("0");
            }else {
                ta.setText(ta.getText().concat("0"));
            }
        } else if (obj == jButton1) {
            if (ta.getText()=="0"){
                ta.setText("1");
            }else{
                ta.setText(ta.getText().concat("1"));
            }
        } else if (obj == jButton2) {
            ta.setText("2");
        } else if (obj == jButton3) {
            ta.setText("3");
        } else if (obj == jButton4) {
            ta.setText("4");
        } else if (obj == jButton5) {
            ta.setText("5");
        } else if (obj == jButton6) {
            ta.setText("6");
        } else if (obj == jButton7) {
            ta.setText("7");
        } else if (obj == jButton8) {
            ta.setText("8");
        } else if (obj == jButton9) {
            ta.setText("9");
        } else if (obj == jButtonDot) {
            ta.setText(".");
        }

    }
}


