package com.example.mabibliotheque;

public class Livre {

    private int id;
    private String title;
    private String author;
    private String pages;

    public Livre(int id, String title, String author, String pages) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPages() {
        return pages;
    }

    public void setPages(String pages) {
        this.pages = pages;
    }
}
