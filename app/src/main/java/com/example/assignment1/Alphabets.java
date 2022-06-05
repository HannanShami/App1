package com.example.assignment1;

public class Alphabets {
    private String name;
    private int imageID;

    public Alphabets(String name, int imageID) {
        this.name = name;
        this.imageID = imageID;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }
}
