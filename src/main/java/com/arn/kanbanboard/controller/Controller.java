package com.arn.kanbanboard.controller;



import com.arn.kanbanboard.model.Model;
import com.arn.kanbanboard.view.View;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {

    private View view;
    private Model model;


    public Controller (View view, Model model){
        this.view = view;
        this.model = model;
        this.view.menuUpdate.addActionListener(this);
        this.view.textAreaLeft1.setText(this.model.itemIn[0].getActivityTodo());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "Board Updated");

        //Update Stickers
        Model mod = new Model();
        this.view.textAreaLeft1.setText(mod.itemIn[0].getActivityTodo());

        //Save Output array

    }

}
