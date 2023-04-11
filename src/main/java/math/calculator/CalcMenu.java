package main.java.math.calculator;

import javax.swing.*;
import java.awt.*;

public class CalcMenu extends JPanel {
    public CalcMenu(){

        JMenu view , edit , help , worksheets ,historyEdit;

        JMenuItem standard,scientific , programmer ,statistic,history , digitGrouping ,basic , unitConversion , dateCalculation ;
        JMenuItem copy , paste;
        JMenuItem mortgage , vehicleLease ,fuelEconomyMPG , fuelEconomyLPer100KM;
        JMenuItem copyHistory ,editHistory,cancelEdit , clear;
        JMenuItem viewHelp , aboutCalculator;


        setBackground(new Color(210,210,210));
        setLayout(null);
        setBounds(0,0,300,20);

        JMenuBar jMenuBar=new JMenuBar();
        view = new JMenu("View");
        edit = new JMenu("Edit");
        help = new JMenu("Help");

        standard = new JMenuItem("Standard");
        scientific = new JMenuItem("Scientific");
        programmer = new JMenuItem("Programmer");
        statistic = new JMenuItem("Statistic");
        history =new JMenuItem("History");
        digitGrouping = new JMenuItem("Digit grouping");
        basic =new JMenuItem("Basic");
        unitConversion = new JMenuItem("Unit conversion");
        dateCalculation = new JMenuItem("Date Calculation");

        worksheets = new JMenu("Worksheets");


        view.add(standard);
        view.add(scientific);
        view.add(programmer);
        view.add(statistic);
        view.add(new JSeparator());
        view.add(history);
        view.add(digitGrouping);
        view.add(new JSeparator());
        view.add(basic);
        view.add(unitConversion);
        view.add(dateCalculation);
        view.add(worksheets);

        mortgage=new JMenuItem("Mortgage");
        vehicleLease =new JMenuItem("Vehicle lease");
        fuelEconomyMPG =new JMenuItem("Fuel economy(mpg)");
        fuelEconomyLPer100KM = new JMenuItem("Fuel economy(L/100 km)");

        worksheets.add(mortgage);
        worksheets.add(vehicleLease);
        worksheets.add(fuelEconomyMPG);
        worksheets.add(fuelEconomyLPer100KM);




        copy = new JMenuItem("Copy");
        paste = new JMenuItem("Paste");
        historyEdit=new JMenu("History");

        edit.add(copy);
        edit.add(paste);
        edit.add(new JSeparator());
        edit.add(historyEdit);

        copyHistory =new JMenuItem("Copy history");
        editHistory = new JMenuItem("Edit");
        cancelEdit = new JMenuItem("Cancel edit");
        clear = new JMenuItem("Clear");

        historyEdit.add(copyHistory);
        historyEdit.add(editHistory);
        historyEdit.add(cancelEdit);
        historyEdit.add(clear);

        viewHelp = new JMenuItem("View Help");
        aboutCalculator = new JMenuItem("About Calculator");

        help.add(viewHelp);
        help.add(new JSeparator());
        help.add(aboutCalculator);

        jMenuBar.add(view);
        jMenuBar.add(edit);
        jMenuBar.add(help);

        jMenuBar.setBounds(0,0,300,19);
        add(jMenuBar);
    }
}
