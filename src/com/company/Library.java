package com.company;

public class Library {


    private Book[] booksInLibrary = new Book[3];

    public int numberOfBooksInLibrary() {
        int numBooks = 0;
        for (int i = 0; i < booksInLibrary.length; i++) {
            if (booksInLibrary[i] != null) {
                numBooks++;
            }
        }
        return numBooks;
    }


public void addBook(Book book) {
    for (int i = 0; i <= booksInLibrary.length; i++) {
        if (booksInLibrary[i] == null) {
            booksInLibrary[i] = book;
            break;
        } //else {System.out.println("Library is Full!");}
    }
}

public boolean libraryFull() {return numberOfBooksInLibrary() == booksInLibrary.length; }

public boolean hasRoom() {return !libraryFull(); }






}