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
        this.view.textAreaCenter1.setText(this.model.itemIn[0].getActivityDoing());
        this.view.textAreaRight1.setText(this.model.itemIn[0].getActivityDone());

        this.view.textAreaLeft2.setText(this.model.itemIn[1].getActivityTodo());
        this.view.textAreaCenter2.setText(this.model.itemIn[1].getActivityDoing());
        this.view.textAreaRight2.setText(this.model.itemIn[1].getActivityDone());

        this.view.textAreaLeft3.setText(this.model.itemIn[2].getActivityTodo());
        this.view.textAreaCenter3.setText(this.model.itemIn[2].getActivityDoing());
        this.view.textAreaRight3.setText(this.model.itemIn[2].getActivityDone());

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "Board Updated");

        //Update Stickers
        Model mod = new Model();
        mod.itemOut[0].setActivityTodo(this.view.textAreaLeft1.getText());
        mod.itemOut[0].setActivityDoing(this.view.textAreaCenter1.getText());
        mod.itemOut[0].setActivityDone(this.view.textAreaRight1.getText());

        mod.itemOut[1].setActivityTodo(this.view.textAreaLeft2.getText());
        mod.itemOut[1].setActivityDoing(this.view.textAreaCenter2.getText());
        mod.itemOut[1].setActivityDone(this.view.textAreaRight2.getText());

        mod.itemOut[2].setActivityTodo(this.view.textAreaLeft3.getText());
        mod.itemOut[2].setActivityDoing(this.view.textAreaCenter3.getText());
        mod.itemOut[2].setActivityDone(this.view.textAreaRight3.getText());


        mod.saveBoard(mod.itemOut);



    }

}
