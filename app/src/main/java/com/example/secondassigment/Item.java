package com.example.secondassigment;


import java.io.Serializable;

public class Item implements Serializable {
    String bookTitle;
    int bookImage;
    String bookAuthor;
    String bookYear;

    public Item(String bookTitle, int bookImage, String bookAuthor, String bookYear){
        this.bookImage = bookImage;
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookYear = bookYear;
    }

    public String getbookTitle() {
        return bookTitle;
    }

    public int getbookImage() {
        return bookImage;
    }

    public String getbookAuthor() {
        return bookAuthor;
    }

    public String getbookYear() {
        return bookYear;
    }

}
