package com.company;

public class Library {

    Book[] booksInLibrary = new Book[10];

    public int numberOfBooksInLibrary() {
        int numberOfBooks = booksInLibrary.length;
        return numberOfBooks;
    }

}
