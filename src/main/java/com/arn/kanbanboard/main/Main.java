package com.arn.kanbanboard.main;

import com.arn.kanbanboard.view.View;
import com.formdev.flatlaf.FlatIntelliJLaf;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        View view = new View();

        //Look and Feel
        try {
            UIManager.setLookAndFeel(new FlatIntelliJLaf());

        } catch (Exception e) {
            System.out.println("Look and Feel not set");
        }

        JFrame frame = new JFrame("MVC Multiply");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(view.panelMain);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
}
