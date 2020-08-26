package com.arn.kanbanboard.main;

import com.arn.kanbanboard.controller.Controller;

import com.arn.kanbanboard.model.Model;

import com.arn.kanbanboard.view.View;
import com.formdev.flatlaf.FlatIntelliJLaf;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        View vie = new View();
        Model mod = new Model();
        Controller ctrl = new Controller(vie, mod);

        //Look and Feel
        try {
            UIManager.setLookAndFeel(new FlatIntelliJLaf());

        } catch (Exception e) {
            System.out.println("Look and Feel not set");
        }

        JFrame frame = new JFrame("Kanban Board");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(vie.panelMain);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
}
