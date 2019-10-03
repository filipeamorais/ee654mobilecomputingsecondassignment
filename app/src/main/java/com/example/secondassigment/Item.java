package com.example.secondassigment;


import java.io.Serializable;

public class Item implements Serializable {
    String flagName;
    int flagImage;
    String flagAuthor;
    String flagYear;

    public Item(String flagName, int flagImage, String flagAuthor, String flagYear){
        this.flagImage = flagImage;
        this.flagName = flagName;
        this.flagAuthor = flagAuthor;
        this.flagYear = flagYear;
    }

    public String getFlagName() {
        return flagName;
    }

    public int getFlagImage() {
        return flagImage;
    }

}
