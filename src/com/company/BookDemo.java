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
        boolean cycle;


        do {
            System.out.println("Welcome to your library! Please select an option.\n1 - See How Many Books You Have\n2 - Add a Book to Your Library\n3 - Exit Program");
            Scanner userInput = new Scanner(System.in);
            int choice = userInput.nextInt();

            if (choice == 1) {
                System.out.println("You have " + yourLibrary.numberOfBooksInLibrary() + " books!\n");
            } else if (choice == 2) {
                Book newBook = new Book();

                System.out.println("Please enter the title of the book");
                userInput.nextLine();
                newBook.setTitle(userInput.nextLine());


                System.out.println("Please enter the author of the book");
                newBook.setAuthor(userInput.nextLine());

                System.out.println("Please enter the number of pages in the book");
                newBook.setNumberOfPages(userInput.nextInt());

                System.out.println("Please enter the year the book was published");
                newBook.setYearPublished(userInput.nextInt());

                System.out.println(newBook.printDetails());

                yourLibrary.booksInLibrary[0] = newBook;

            }
            else {
                System.out.println("Thank you and have a great day!");
                break;
                }

        } while (cycle = true);
    }
}
