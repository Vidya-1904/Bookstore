package com.example.bookstore;

public class Book {
    private int id;
    private String title;
    private String author;
    private double price;
    private String image;

    public Book(int id, String title, String author, double price, String image) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
        this.image = image;
    }

    public int getId() { return id; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public double getPrice() { return price; }
    public String getImage() { return image; }
}