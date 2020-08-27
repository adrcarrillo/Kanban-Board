package com.arn.kanbanboard.model;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReaderFile {
    public Item[] itemArray;
    BufferedReader reader;

    public Item[] Reader() {
        try {
            String userPath = System.getProperty("user.home");
            reader = new BufferedReader(new FileReader(userPath+"/data.json"));
            Gson gson = new Gson();
            itemArray = gson.fromJson(reader, Item[].class);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return this.itemArray;
    }
}
