package com.arn.kanbanboard.model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;

public class Model {

    public Item[] itemIn;
    public Item[] itemOut = new Item[3];
    //public Item[] itemOut; //Runtime error!!!


    BufferedReader reader;
    BufferedWriter writer;
    String userPath = System.getProperty("user.home");




    public Item[] ReadArray() {
        try {
            reader = new BufferedReader(new FileReader(userPath+"/data.json"));

            GsonBuilder gsonBuilder = new GsonBuilder();
            gsonBuilder.registerTypeAdapter(Item.class, new ItemCreator());
            Gson gson = gsonBuilder.create();
            itemIn = gson.fromJson(reader, Item[].class);

        } catch (FileNotFoundException e) {

            e.printStackTrace();
        }
        return this.itemIn;
    }

    public Item[] WriteArray(Item[] itemIn){
        itemOut[0] = new Item(this.itemIn[0].getActivityTodo(), this.itemIn[0].getActivityDoing(), this.itemIn[0].getActivityDone());
        itemOut[1] = new Item(this.itemIn[0].getActivityTodo(), this.itemIn[0].getActivityDoing(), this.itemIn[0].getActivityDone());
        itemOut[2] = new Item(this.itemIn[0].getActivityTodo(), this.itemIn[0].getActivityDoing(), this.itemIn[0].getActivityDone());
        return  this.itemOut;
    }

    public void Save(Item[] itemOut){
        try {
            Gson gson = new Gson();
            writer = new BufferedWriter(new FileWriter(userPath+"/data.json"));
            String json = gson.toJson(itemOut);
            writer.write(json);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
