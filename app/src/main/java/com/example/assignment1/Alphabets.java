package com.example.assignment1;

public class Alphabets {
    private String name;
    private int imageID;
    private int im;

    public Alphabets(String name, int imageID, int im) {
        this.name = name;
        this.imageID = imageID;
        this.im = im;
    }

    public int getIm() {
        return im;
    }

    public void setIm(int im) {
        this.im = im;
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
