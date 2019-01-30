package com.company;

import java.util.List;
import java.util.ArrayList;

public class Library {

    private List<Book> booksInLibrary = new ArrayList<>();

    public int numberOfBooksInLibrary() {
        return booksInLibrary.size();
    }


    public void addBook(Book book) {
        booksInLibrary.add(book);
    }


//public String searchBookTitle(String titleSearch) {
//for (int i = 0; i <= booksInLibrary.size(); i++) {
//if (booksInLibrary[i].bookTitle == titleSearch);
//int matchingIndex = i;
    //       }System.out.println(booksInLibrary[matching]);
//    }


}