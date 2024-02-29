package org.example.entities;

public class ToDo extends _BaseEntity {
    private String title;
    private String description;
    private boolean isDone;

    public ToDo() {
    }

    public ToDo(int id, String title, String description, boolean isDone) {
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
        return "\r\n\r\nToDo{\r\n" +
                super.toString() +
                "\r\ntitle: " + title +
                "\r\ndescription: " + description +
                "\r\nisDone: " + isDone +
                "} ";
    }
}
