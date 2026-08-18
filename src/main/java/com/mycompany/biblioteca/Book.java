package com.mycompany.biblioteca;

public class Book extends Material {

    private String author, available;

    public Book(String code, String title, String datePublic, String author, String available) {
        super(code, title, datePublic);
        this.author = author;
        this.available = available;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAvailable() {
        return available;
    }

    public void setAvailable(String available) {
        this.available = available;
    }

}
