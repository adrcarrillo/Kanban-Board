package com.arn.kanbanboard.model;

public class Model {
    private String Note;

    public String getNote() {
        return Note;
    }

    public void setNote(String note) {
        Note = note;
    }

    public String activityA() {
        this.Note = "Hi I'm a new activity!";
        return this.Note;
    }

    ReaderFile rdr = new ReaderFile();
    public Item[] itemArray = rdr.Reader();

    public void Show(){
        System.out.println(itemArray[0].getActivity());
        System.out.println(itemArray[1].getActivity());
        System.out.println(itemArray[2].getActivity());
    }

}
