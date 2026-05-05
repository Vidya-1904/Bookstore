package com.example.bookstore;

public class Book {
    private int id;
    private String title;
    private String author;
    private double price;
    private String image;
    private double rating;
    private int reviewCount;
    private String description;

    public Book(int id, String title, String author, double price, String image, double rating, int reviewCount, String description) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
        this.image = image;
        this.rating = rating;
        this.reviewCount = reviewCount;
        this.description = description;
    }

    public int getId() { return id; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public double getPrice() { return price; }
    public String getImage() { return image; }
    public double getRating() { return rating; }
    public int getReviewCount() { return reviewCount; }
    public String getDescription() { return description; }
}
