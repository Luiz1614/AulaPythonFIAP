package org.example.entities;

public class User extends _BaseEntity{
    private String name;

    public User(int id, String name) {
        super(id);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name: " + name +
                "} " + super.toString();
    }
}
