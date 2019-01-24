package com.company;

public class Book {

    private String title;
    private String author;
    private int numberOfPages;
    private int yearPublished;


    public void setTitle(String bookTitle) {
        title = bookTitle;
    }
    public String getTitle() {return title;}



    public void setAuthor(String bookAuthor) {
        author = bookAuthor;
    }
    public String getAuthor() {return author;}



    public void setNumberOfPages(int bookPages) {
        numberOfPages = bookPages;
    }
    public int getNumberOfPages() {return numberOfPages;}



    public void setYearPublished(int yearPub) {
        yearPublished = yearPub;
    }
    public int getYearPublished() {return yearPublished;}



    public void printDetails() {
        System.out.println("Title: " + title + "\nAuthor: " + author + "\nNumber of Pages: " + numberOfPages + "\nYear Published: " + yearPublished);
    }
}
