package com.arn.kanbanboard.model;

import com.google.gson.Gson;

import java.io.*;

public class ParserJson {
    public Item[] itemIn;
    public Item[] itemOut = new Item[3];

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

    public Item[] WriteArray(String[][] stringArray){
        itemOut[0] = new Item(stringArray[0][0], stringArray[0][1], stringArray[0][2]);
        itemOut[1] = new Item(stringArray[1][0], stringArray[1][1], stringArray[1][2]);
        itemOut[2] = new Item(stringArray[2][0], stringArray[2][1], stringArray[2][2]);
        return this.itemOut;
    }



    public void Save(Item[] itemOut){
        try {
            writer = new BufferedWriter(new FileWriter(userPath+"/data2.json"));
            String json = gson.toJson(itemOut);
            writer.write(json);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
