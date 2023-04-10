package main.java.math;

import javax.swing.*;
import java.awt.*;

public class Board extends JPanel {

    JMenuBar jMenuBar;

    JMenu view, edit, help, worksheets ,historyOfEdit;

    JMenuItem standard, scientific, programmer , statistics , history,digitGrouping , basic , unitConversion , dateCalculation;
    JMenuItem mortgage , vehicleLease , fuelEconomyMPG , fuelEconomyLPerKM;
    JMenuItem copy , paste ;
    JMenuItem viewHelp , aboutCalculator;


    public Board() {
        initBoard();
    }

    private void initBoard() {
        setBackground(new Color(150, 150, 230));

        setLayout(new GridLayout(15 , 1));
        jMenuBar = new JMenuBar();


        view = new JMenu("View");
        edit = new JMenu("Edit");
        help = new JMenu("Help");
        worksheets = new JMenu("Worksheets");

        standard = new JMenuItem("Standard");
        scientific = new JMenuItem("Scientific");
        programmer = new JMenuItem("Programmer");
        statistics = new JMenuItem("Statistics");
        history = new JMenuItem("History");
        digitGrouping = new JMenuItem("Digit grouping");
        basic = new JMenuItem("Basic");
        unitConversion = new JMenuItem("Unit conversion");
        dateCalculation = new JMenuItem("Date calculation");


        mortgage = new JMenuItem("Mortgage");
        vehicleLease = new JMenuItem("Vehicle lease");
        fuelEconomyMPG = new JMenuItem("Fuel economy (mpg)");
        fuelEconomyLPerKM = new JMenuItem("Fuel economy (L/100 km)");


        copy = new JMenuItem("Copy");
        paste = new JMenuItem("Paste");

        historyOfEdit = new JMenu("History");


        view.add(standard);
        view.add(scientific);
        view.add(programmer);
        view.add(statistics);
        view.add(new JSeparator());
        view.add(history);
        view.add(digitGrouping);
        view.add(new JSeparator());
        view.add(basic);
        view.add(unitConversion);
        view.add(dateCalculation);
        view.add(worksheets);

        worksheets.add(mortgage);
        worksheets.add(vehicleLease);
        worksheets.add(fuelEconomyMPG);
        worksheets.add(fuelEconomyLPerKM);

        edit.add(copy);
        edit.add(paste);
        edit.add(new JSeparator());
        edit.add(historyOfEdit);

        jMenuBar.add(view);
        jMenuBar.add(edit);
        jMenuBar.add(help);


        this.add(jMenuBar);
    }
}
