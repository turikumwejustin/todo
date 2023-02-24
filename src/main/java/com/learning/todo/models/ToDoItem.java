package com.learning.todo.models;
import java.time.LocalDateTime;

public class ToDoItem{
    private String id;
    private String activity;
    private LocalDateTime  createdOn;
    public void setId(String id) {
        this.id = id;
    }
    public void setActivity(String activity) {
        this.activity = activity;
    }
    public void setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
    }
    public ToDoItem(String id, String activity, LocalDateTime createdOn) {
        this.id = id;
        this.activity = activity;
        this.createdOn = createdOn;
    }
    @Override
    public String toString() {
        return "ToDoItem [id=" + id + ", activity=" + activity + ", createdOn=" + createdOn + "]";
    }
    
    

}