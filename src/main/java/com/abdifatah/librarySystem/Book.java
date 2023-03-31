package com.abdifatah.librarySystem;

/**
 - Library System: Develop a library system that allows users to search,
   borrow, and return books. Each book can have attributes like title,
   author, ISBN, and availability status.
 **/
public class Book {
    private final String title;
    private final String author;
    private final String isbn;
    private boolean available;

    public Book(String title, String author, String isbn, boolean available) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.available = available;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public boolean isAvailable() {
        return this.available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

   @Override
    public String toString() {
        String status = this.available ? "Available" : "Not Available";
        return "Title: " + this.title + "\n" +
                "Author: " + this.author + "\n" +
                "ISBN: " + this.isbn + "\n" +
                "Status: " + status;
    }

}

