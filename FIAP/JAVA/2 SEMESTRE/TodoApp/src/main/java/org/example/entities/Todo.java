package org.example.entities;

import java.util.StringJoiner;

public class Todo extends _BaseEntity {
    private String title;
    private String description;
    private boolean isDone;

    public Todo() {
    }

    public Todo(int id, String title, String description, boolean isDone) {
        super(id);
        this.title = title;
        this.description = description;
        this.isDone = isDone;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", isDone=" + isDone +
                "} " + super.toString();
    }
}
