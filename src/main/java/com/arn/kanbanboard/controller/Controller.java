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
        this.view.menuOpen.addActionListener(this);
//        this.view.textAreaCenter1.setText(this.model.activityA());
        this.view.textAreaLeft1.setText(this.model.itemArray[0].getActivityTodo());
        this.view.textAreaLeft2.setText(this.model.itemArray[1].getActivityTodo());
        this.view.textAreaLeft3.setText(this.model.itemArray[2].getActivityTodo());

        this.view.textAreaCenter1.setText(this.model.itemArray[0].getActivityDoing());
        this.view.textAreaCenter2.setText(this.model.itemArray[1].getActivityDoing());
        this.view.textAreaCenter3.setText(this.model.itemArray[2].getActivityDoing());

        this.view.textAreaRight1.setText(this.model.itemArray[0].getActivityDone());
        this.view.textAreaRight2.setText(this.model.itemArray[1].getActivityDone());
        this.view.textAreaRight3.setText(this.model.itemArray[2].getActivityDone());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "Menu WIP");
    }
}
