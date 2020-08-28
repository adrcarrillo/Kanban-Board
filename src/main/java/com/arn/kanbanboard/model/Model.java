package com.arn.kanbanboard.model;

public class Model {
    private String Note;

    public String getNote() {
        return Note;
    }

    public void setNote(String note) {
        Note = note;
    }

    /*
    public String activityA() {
        this.Note = "Hi I'm a new activity!";
        return this.Note;
    }
     */

    ParserJsonFile rdr = new ParserJsonFile();
    public Item[] itemArray = rdr.Reader();

}
