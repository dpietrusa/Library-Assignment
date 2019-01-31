package com.company;

import java.util.List;
import java.util.ArrayList;

public class Library {

    public List<Book> booksInLibrary = new ArrayList<>();

    public int numberOfBooksInLibrary() {
        return booksInLibrary.size();
    }


    public void addBook(Book book) {
        booksInLibrary.add(book);
    }


    public void searchBookTitle(String titleSearch) {

        for (int i = 0; i < booksInLibrary.size(); i++) {
            boolean solution = false;
            do {

                if (booksInLibrary.get(i) != null && booksInLibrary.get(i).bookTitle.equals(titleSearch)) {
                    System.out.println("Here are the details of that book:\n" + booksInLibrary.get(i).printDetails() + "/n");
                    solution = true;
                    break;

                } else if (solution = false) {
                System.out.println("No books match this title!");
                }

            } while (solution);
        }
    }


}