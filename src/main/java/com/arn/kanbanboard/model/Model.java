package com.arn.kanbanboard.model;

public class Model {

    ParserJson parserJson = new ParserJson();
    public Item[] itemIn = parserJson.ReadArray();
    public Item[] itemOut = parserJson.WriteArray(itemIn);

    public void saveBoard(Item[] itemOut){
        parserJson.Save(this.itemOut);
    }

}
