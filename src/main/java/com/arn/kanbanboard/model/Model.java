package com.arn.kanbanboard.model;

public class Model {

    ParserJsonFile rdr = new ParserJsonFile();
    public Item[] itemArray = rdr.ReaderArray();

}
