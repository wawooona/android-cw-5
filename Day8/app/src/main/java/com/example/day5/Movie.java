package com.example.day5;

import java.io.Serializable;

enum genre {
    comedy,
    action,
    romantic,
    horror
}

public class Movie implements Serializable {
    private  String name;
    private double rate;
    private genre g;
    private int img;

    public genre getG() {
        return g;
    }

    public void setG(genre g) {
        this.g = g;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        if (rate >= 4)
        this.rate = rate;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public Movie(String name, double rate, genre g, int img) {
        this.name = name;
        this.rate = rate;
        this.g = g;
        this.img = img;
    }
}

