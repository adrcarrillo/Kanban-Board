package com.arn.kanbanboard.model;

import com.google.gson.Gson;

import java.io.*;

public class ParserJsonFile {
    public Item[] itemArray;

    BufferedReader reader;
    BufferedWriter writer;
    String userPath = System.getProperty("user.home");

    Gson gson = new Gson();

    public Item[] Reader() {
        try {
 //           this.userPath = userPath;
            reader = new BufferedReader(new FileReader(userPath+"/data.json"));
            itemArray = gson.fromJson(reader, Item[].class);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return this.itemArray;
    }


    public void Writer() {
        try {
            writer = new BufferedWriter(new FileWriter(userPath+"/data2.json"));

            /*
            ItemX itemX = new ItemX("adrian", "myemail");
            String json = gson.toJson(itemX);
            writer.write(json);
             */

            Item iArray = new Item("Hi Todo", "Hi Doing", "Hi Done");
            String json = gson.toJson(iArray);
            writer.write(json);
            writer.close();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
