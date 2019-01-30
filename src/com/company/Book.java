package com.company;

public class Book {

    private String bookTitle;
    private String bookAuthor;
    private int bookNumberOfPages;
    private int bookYearPublished;

    public Book(String title, String author, int numberOfPages, int yearPublished) {
        this.bookTitle = title;
        this.bookAuthor = author;
        this.bookNumberOfPages = numberOfPages;
        this.bookYearPublished = yearPublished;
    }

       public String printDetails() {
           return ("Title: " + bookTitle + "\nAuthor: " + bookAuthor + "\nNumber of Pages: " + bookNumberOfPages
                + "\nYear Published: " + bookYearPublished);

    }
}
