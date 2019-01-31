package com.company;

import java.util.Scanner;

public class BookDemo {

    public static void main(String[] args) {
        //Create a new class named Book and give it at least (4) properties (such as title, author, number of pages, etc.). Create getter & setter methods for each variable. Create a printDetails() method which will display all available information about a Book object.
        //
        //Create a new class named Library and give it (1) property: an array of Book objects. Library should have a numberOfBooksInLibrary() method which displays how many Books the user has in their Library.
        //
        //In a class named BookDemo, give the user (3) options: they can see how many books they have, add a book to their Library, or exit the program. If they choose to add a book, they should be prompted to enter all the necessary details about each book. The user should be able to add as many books as they want, and view the number of books in their library as often as they wish.


        Library yourLibrary = new Library();
        boolean cycle = true;


        do {
            System.out.println("Welcome to your library! Please select an option.\n1 - See How Many Books You Have\n" +
                    "2 - Add a Book to Your Library\n3 - Search Book By Title\n4 - Delete a Book\n5 - Update a Book\n" +
                    "6 - Exit Program");
            Scanner userInput = new Scanner(System.in);
            int choice = userInput.nextInt();

            switch (choice) {

                case 1: //number of books

                    if (yourLibrary.numberOfBooksInLibrary() == 1) {
                        System.out.println("You have " + yourLibrary.numberOfBooksInLibrary() + " book!\n");
                    } else System.out.println("You have " + yourLibrary.numberOfBooksInLibrary() + " books!\n");
                    break;

                case 2: //add book
                    char anotherBook;

                    do {

                        System.out.println("Please enter the title of the book:");
                        userInput.nextLine();
                        String title = (userInput.nextLine());

                        System.out.println("Please enter the author of the book:");
                        String author = (userInput.nextLine());

                        System.out.println("Please enter the number of pages in the book:");
                        int numberOfPages = (userInput.nextInt());

                        System.out.println("Please enter the year the book was published:");
                        int yearPublished = (userInput.nextInt());

                        Book newBook = new Book(title, author, numberOfPages, yearPublished);
                        yourLibrary.addBook(newBook);

                        System.out.println(newBook.printDetails());

                        System.out.println("Would you like to enter another book? Y/N");
                        anotherBook = userInput.next().charAt(0);

                    } while (anotherBook == 'y' || anotherBook == 'Y');


                    break;

                case 3: //search book
                    char anotherSearch;

                    do {

                        System.out.println("Enter the title of the book you would like to search for:");
                        userInput.nextLine();
                        String titleSearch = (userInput.nextLine());
                        //for (int i = 0; i <= yourLibrary.numberOfBooksInLibrary(); i++) {

                        if (yourLibrary.booksInLibrary.size() == 0) {
                            System.out.println("Your library is empty!");
                        }

                        else yourLibrary.searchBookTitle(titleSearch);
                        System.out.println("Search another book by title? Y/N");
                        anotherSearch = userInput.next().charAt(0);

                    } while (anotherSearch == 'y' || anotherSearch == 'Y');


                    break;


                case 6:
                    System.out.println("Thank you and have a great day!");
                    cycle = false;
                    break;

                default:
                    System.out.println("Please choose an options 1 - 6");

            }

        } while (cycle);

    }
}



