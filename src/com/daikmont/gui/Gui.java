package com.daikmont.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Gui extends Frame implements WindowListener, ActionListener {
    Button addChick;
    TextField text = new TextField(20);
    private int howMany = 0;

    public Gui(String title){
        super(title);
        setLayout(new FlowLayout());
        addWindowListener(this);
        addChick = new Button("Add");
        add(addChick);
        add(text);
    }
    public void actionPerformed(ActionEvent actionEvent) {
        howMany++;
        text.setText("added " + howMany);
    }

    public void windowClosing(WindowEvent e) {
        dispose();
        System.exit(0);
    }

    public void windowOpened(WindowEvent e) {}
    public void windowActivated(WindowEvent e) {}
    public void windowIconified(WindowEvent e) {}
    public void windowDeiconified(WindowEvent e) {}
    public void windowDeactivated(WindowEvent e) {}
    public void windowClosed(WindowEvent e) {}
}
