package com.example.task_appalparslanbegenjov.Model;

public class ToDoModel {
    private String task;
    private int id, status;

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public ToDoModel(){
        this.id = id;
        this.task = task;
        this.status = status;
    }

}
