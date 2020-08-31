package com.arn.kanbanboard.model;

public class Item {

    private String activityTodo;
    private String activityDoing;
    private String activityDone;

    public String getActivityTodo() {
        return activityTodo;
    }

    public void setActivityTodo(String activityTodo) {
        this.activityTodo = activityTodo;
    }

    public String getActivityDoing() {
        return activityDoing;
    }

    public void setActivityDoing(String activityDoing) {
        this.activityDoing = activityDoing;
    }

    public String getActivityDone() {
        return activityDone;
    }

    public void setActivityDone(String activityDone) {
        this.activityDone = activityDone;
    }

    public Item(String activityTodo, String activityDoing, String activityDone) {
        this.activityTodo = activityTodo;
        this.activityDoing = activityDoing;
        this.activityDone = activityDone;
    }

}
