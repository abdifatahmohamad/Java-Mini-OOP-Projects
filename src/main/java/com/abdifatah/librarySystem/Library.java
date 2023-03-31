package com.abdifatah.librarySystem;

import java.util.ArrayList;
import java.util.Scanner;

/**
 - Library class that will manage the collection of books.
 - It should have methods to add books to the collection,
   remove books from the collection, and display the list of books.
 **/

public class Library {
    private final ArrayList<Book> books;

    public Library(){
        this.books = new ArrayList<>();
    }

    public void addBook(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the title of the book: ");
        String title = sc.nextLine();

        System.out.println("Enter the author of the book: ");
        String author = sc.nextLine();

        System.out.println("Enter the ISBN of the book: ");
        String isbn = sc.nextLine();

        System.out.println("Enter book availability: ");
        boolean availability = sc.nextBoolean();

        Book newBook = new Book(title, author, isbn, availability);

        books.add(newBook);
        System.out.println("Book added successfully!");


    }

    public void borrowBook(String isbn){
        boolean bookFound = false;
        for(Book book: this.books){
            if (book.getIsbn().equals(isbn) && book.isAvailable()){
                book.setAvailable(false);
                bookFound = true;
                System.out.println("You have borrowed the book: " + book.getTitle());
                break;
            }
        }

        if(!bookFound){
            System.out.println("Sorry, the book with ISBN " +  isbn +  " is not available.");
        }
    }

    public void removeBook(String isbn){
        boolean bookFound = false;
        for(int i=0; i < books.size(); i++){
            if (this.books.get(i).getIsbn().equals(isbn)){
                Book bookToRemove = this.books.get(i);
                bookToRemove.setAvailable(true);
                this.books.remove(i);
                bookFound = true;
                System.out.println("The book with ISBN : " + isbn + " has been removed from the collection.");
                break;
            }
        }

        if(!bookFound){
            System.out.println("Sorry, the book with ISBN " +  isbn +  " was not found in the collection.");
        }
    }

    public void displayBook(){
        if (books.size() == 0){
            System.out.println("There is no books in the collections.");
        } else{
            for(Book book: this.books){
                System.out.println("----------- Book Details ----------------");
                System.out.println(book.toString());
                System.out.println();
            }
        }
    }
};
