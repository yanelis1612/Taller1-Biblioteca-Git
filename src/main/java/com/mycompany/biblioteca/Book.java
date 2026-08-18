package com.mycompany.biblioteca;

public class Book extends Material {
    private String Author;
    private boolean Available;

    public Book(String code, String title, String publicationYear, String author) {
        super(code, title, publicationYear);
        this.Author = author;
        this.Available = true;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        this.Author = author;
    }

    public boolean isAvailable() {
        return Available;
    }

    public void setAvailable(boolean available) {
        this.Available = available;
    }
}
