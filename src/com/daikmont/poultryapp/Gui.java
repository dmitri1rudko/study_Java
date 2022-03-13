package com.daikmont.poultryapp;
import javax.swing.*;
import java.awt.*;

public class Gui{
    public void Frame() {
        //Создаем окно
        JFrame frame = new JFrame("Poultry LogBook");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 300);

        JPanel panelNorth = new JPanel();
        JPanel panelSouth = new JPanel();

        JTextField textField = new JTextField(5);
        textField.setPreferredSize(new Dimension(130,30));
        JTextArea textArea = new JTextArea("Total chicken...");

        JButton buttonAdd = new JButton("Add chicken");
        buttonAdd.setPreferredSize(new Dimension(130,30));


        JButton buttonRemove = new JButton("Remove chicken");
        buttonRemove.setPreferredSize(new Dimension(130,30));


        JButton buttonSummary = new JButton("Print total");
        buttonSummary.setPreferredSize(new Dimension(130,30));

        panelNorth.add(textField);
        panelNorth.add(buttonAdd);
        panelNorth.add(buttonRemove);
        panelNorth.add(buttonSummary);


        panelSouth.add(textArea);


        //Добавляем обьекты на frame
        frame.getContentPane().add(BorderLayout.NORTH, panelNorth);
        frame.getContentPane().add(BorderLayout.SOUTH, panelSouth);


        //Делаем окно видимым
        frame.setVisible(true);
    }


}
