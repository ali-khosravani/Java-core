package main.java.app.remover;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Board extends JPanel implements ActionListener {

    JTextField txtName, txtMobileNumber;
    JRadioButton male;
    JComboBox<String> date, month, year;
    JTextArea tAdd, tout;
    JCheckBox term;
    JButton sub, reset;
    JLabel res;

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

        JLabel mno = new JLabel("Mobile");
        mno.setFont(new Font("Arial", Font.PLAIN, 20));
        mno.setSize(100, 20);
        mno.setLocation(startColumn1, 150);
        add(mno);

        txtMobileNumber = new JTextField();
        txtMobileNumber.setFont(new Font("Arial", Font.PLAIN, 15));
        txtMobileNumber.setSize(150, 20);
        txtMobileNumber.setLocation(startColumn2, 150);
        add(txtMobileNumber);

        JLabel gender = new JLabel("Gender");
        gender.setFont(new Font("Arial", Font.PLAIN, 20));
        gender.setSize(100, 20);
        gender.setLocation(startColumn1, 200);
        add(gender);

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

        JLabel dob = new JLabel("DOB");
        dob.setFont(new Font("Arial", Font.PLAIN, 20));
        dob.setSize(100, 20);
        dob.setLocation(startColumn1, 250);
        add(dob);

        String[] dates = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
        date = new JComboBox<>(dates);
        date.setFont(new Font("Arial", Font.PLAIN, 15));
        date.setSize(50, 20);
        date.setLocation(startColumn2, 250);
        add(date);

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

        tAdd = new JTextArea();
        tAdd.setFont(new Font("Arial", Font.PLAIN, 15));
        tAdd.setSize(200, 75);
        tAdd.setLocation(startColumn2, 300);
        tAdd.setLineWrap(true);
        add(tAdd);

        term = new JCheckBox("Accept Terms And Conditions.");
        term.setFont(new Font("Arial", Font.PLAIN, 15));
        term.setSize(250, 20);
        term.setLocation(150, 400);
        add(term);

        sub = new JButton("Submit");
        sub.setFont(new Font("Arial", Font.PLAIN, 15));
        sub.setSize(100, 20);
        sub.setLocation(150, 450);
        sub.addActionListener(this);
        add(sub);

        reset = new JButton("Reset");
        reset.setFont(new Font("Arial", Font.PLAIN, 15));
        reset.setSize(100, 20);
        reset.setLocation(270, 450);
        reset.addActionListener(this);
        add(reset);

        tout = new JTextArea();
        tout.setFont(new Font("Arial", Font.PLAIN, 15));
        tout.setSize(300, 400);
        tout.setLocation(450, 100);
        tout.setLineWrap(true);
        tout.setEditable(false);
        add(tout);

        res = new JLabel("");
        res.setFont(new Font("Arial", Font.PLAIN, 20));
        res.setSize(500, 25);
        res.setLocation(startColumn1, 500);
        add(res);
    }


    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == sub) {
            if (term.isSelected()) {
                String data1;
                String data = "Name : " + txtName.getText() + "\n" + "Mobile : " + txtMobileNumber.getText() + "\n";
                if (male.isSelected()) data1 = "Gender : Male" + "\n";
                else data1 = "Gender : Female" + "\n";
                String data2 = "DOB : " + date.getSelectedItem() + "/" + month.getSelectedItem() + "/" + year.getSelectedItem() + "\n";
                String data3 = "Address : " + tAdd.getText();
                tout.setText(data + data1 + data2 + data3);
                tout.setEditable(false);
                res.setText("Registration Successfully..");
            } else {
                tout.setText("");
                res.setText("Please accept the" + " terms & conditions..");
            }
        } else if (e.getSource() == reset) {
            String def = "";
            txtName.setText(def);
            tAdd.setText(def);
            txtMobileNumber.setText(def);
            res.setText(def);
            tout.setText(def);
            term.setSelected(false);
            date.setSelectedIndex(0);
            month.setSelectedIndex(0);
            year.setSelectedIndex(0);
        }
    }
}