package com.arn.kanbanboard.model;

import com.google.gson.Gson;

import java.io.*;

public class ParserJson {
    public Item[] itemIn;
    public Item[] itemOut = new Item[3];
    //public Item[] itemOut; //Runtime error!!!

    BufferedReader reader;
    BufferedWriter writer;
    String userPath = System.getProperty("user.home");
    Gson gson = new Gson();

    public Item[] ReadArray() {
        try {
            reader = new BufferedReader(new FileReader(userPath+"/data.json"));
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
            writer = new BufferedWriter(new FileWriter(userPath+"/data.json"));
            String json = gson.toJson(itemOut);
            writer.write(json);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
