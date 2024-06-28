package main.java.app.remover;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Board extends JPanel implements ActionListener {

    JTextField txtName, txtMobileNumber;
    JRadioButton male;
    JComboBox<String> day, month, year;
    JTextArea txtAddress, txtOut;
    JCheckBox term;
    JButton btnSub, btnReset;
    JLabel lblRes;

    public Board() {
        initUI();
    }

    private void initUI() {
        int startColumn1 = 60;
        int startColumn2 = 160;
        // Components of the Form
        setLayout(null);
        JLabel lblTitle = new JLabel("Remove Data From Database");
        lblTitle.setFont(new Font("Arial", Font.PLAIN, 30));
        lblTitle.setSize(400, 30);
        lblTitle.setLocation(200, 30);
        add(lblTitle);

        JLabel lblName = new JLabel("Name");
        lblName.setFont(new Font("Arial", Font.PLAIN, 20));
        lblName.setSize(100, 20);
        lblName.setLocation(startColumn1, 100);
        add(lblName);

        txtName = new JTextField();
        txtName.setFont(new Font("Arial", Font.PLAIN, 15));
        txtName.setSize(190, 20);
        txtName.setLocation(startColumn2, 100);
        add(txtName);

        JLabel lblMobileNumber = new JLabel("Mobile");
        lblMobileNumber.setFont(new Font("Arial", Font.PLAIN, 20));
        lblMobileNumber.setSize(100, 20);
        lblMobileNumber.setLocation(startColumn1, 150);
        add(lblMobileNumber);

        txtMobileNumber = new JTextField();
        txtMobileNumber.setFont(new Font("Arial", Font.PLAIN, 15));
        txtMobileNumber.setSize(150, 20);
        txtMobileNumber.setLocation(startColumn2, 150);
        add(txtMobileNumber);

        JLabel lblGender = new JLabel("Gender");
        lblGender.setFont(new Font("Arial", Font.PLAIN, 20));
        lblGender.setSize(100, 20);
        lblGender.setLocation(startColumn1, 200);
        add(lblGender);

        male = new JRadioButton("Male");
        male.setFont(new Font("Arial", Font.PLAIN, 15));
        male.setSelected(true);
        male.setSize(75, 20);
        male.setLocation(startColumn2, 200);
        add(male);

        JRadioButton female = new JRadioButton("Female");
        female.setFont(new Font("Arial", Font.PLAIN, 15));
        female.setSelected(false);
        female.setSize(80, 20);
        female.setLocation(275, 200);
        add(female);

        ButtonGroup sexGroup = new ButtonGroup();
        sexGroup.add(male);
        sexGroup.add(female);

        JLabel lblBirthDate = new JLabel("DOB");
        lblBirthDate.setFont(new Font("Arial", Font.PLAIN, 20));
        lblBirthDate.setSize(100, 20);
        lblBirthDate.setLocation(startColumn1, 250);
        add(lblBirthDate);

        String[] days = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
        day = new JComboBox<>(days);
        day.setFont(new Font("Arial", Font.PLAIN, 15));
        day.setSize(50, 20);
        day.setLocation(startColumn2, 250);
        add(day);

        String[] months = {"Jan", "feb", "Mar", "Apr", "May", "Jun", "July", "Aug", "Sup", "Oct", "Nov", "Dec"};
        month = new JComboBox<>(months);
        month.setFont(new Font("Arial", Font.PLAIN, 15));
        month.setSize(60, 20);
        month.setLocation(250, 250);
        add(month);

        String[] years = {"1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019"};
        year = new JComboBox<>(years);
        year.setFont(new Font("Arial", Font.PLAIN, 15));
        year.setSize(60, 20);
        year.setLocation(320, 250);
        add(year);

        JLabel add = new JLabel("Address");
        add.setFont(new Font("Arial", Font.PLAIN, 20));
        add.setSize(100, 20);
        add.setLocation(startColumn1, 300);
        add(add);

        txtAddress = new JTextArea();
        txtAddress.setFont(new Font("Arial", Font.PLAIN, 15));
        txtAddress.setSize(200, 75);
        txtAddress.setLocation(startColumn2, 300);
        txtAddress.setLineWrap(true);
        add(txtAddress);

        term = new JCheckBox("Accept Terms And Conditions.");
        term.setFont(new Font("Arial", Font.PLAIN, 15));
        term.setSize(250, 20);
        term.setLocation(150, 400);
        add(term);

        btnSub = new JButton("Submit");
        btnSub.setFont(new Font("Arial", Font.PLAIN, 15));
        btnSub.setSize(100, 20);
        btnSub.setLocation(150, 450);
        btnSub.addActionListener(this);
        add(btnSub);

        btnReset = new JButton("Reset");
        btnReset.setFont(new Font("Arial", Font.PLAIN, 15));
        btnReset.setSize(100, 20);
        btnReset.setLocation(270, 450);
        btnReset.addActionListener(this);
        add(btnReset);

        txtOut = new JTextArea();
        txtOut.setFont(new Font("Arial", Font.PLAIN, 15));
        txtOut.setSize(300, 400);
        txtOut.setLocation(450, 100);
        txtOut.setLineWrap(true);
        txtOut.setEditable(false);
        add(txtOut);

        lblRes = new JLabel("");
        lblRes.setFont(new Font("Arial", Font.PLAIN, 20));
        lblRes.setSize(500, 25);
        lblRes.setLocation(startColumn1, 500);
        add(lblRes);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnSub) {
            if (term.isSelected()) {
                String data1 = (!male.isSelected()) ? "Gender : Female \n" : "Gender : Male \n";
                String data = "Name : " + txtName.getText() + "\n Mobile : " + txtMobileNumber.getText() + "\n";
                String data2 = "DOB : " + day.getSelectedItem() + "/" + month.getSelectedItem() + "/" + year.getSelectedItem() + "\n";
                String data3 = "Address : " + txtAddress.getText();
                txtOut.setText(data + data1 + data2 + data3);
                lblRes.setText("Registration Successfully..");
            } else {
                lblRes.setText("Please accept the terms & conditions..");
            }
        } else if (e.getSource() == btnReset) {
            term.setSelected(false);
            day.setSelectedIndex(0);
            month.setSelectedIndex(0);
            year.setSelectedIndex(0);
            txtOut.setText("");
            txtAddress.setText("");
            txtName.setText("");
            txtMobileNumber.setText("");
            lblRes.setText("");
        }
    }
}