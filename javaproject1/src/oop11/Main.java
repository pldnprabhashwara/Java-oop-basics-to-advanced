package oop11;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Book ID: ");
        int bookId = input.nextInt();
        input.nextLine();

        System.out.print("Enter Book Title: ");
        String bookTitle = input.nextLine();

        System.out.print("Enter Book Author: ");
        String bookAuthor = input.nextLine();

        System.out.print("Enter Available Copies: ");
        int availableCopies = input.nextInt();
        input.nextLine();

        if (availableCopies > 0) {
            System.out.println("Book created successfully!");
        } else {
            System.out.println("Book could not be created!");
        }

        Book book = new Book(bookId, bookTitle, bookAuthor, availableCopies);

        System.out.print("\nHow many copies to borrow? ");
        int borrowCopies = input.nextInt();
        input.nextLine();
        book.borrowBook(borrowCopies);

        System.out.print("How many copies to return? ");
        int returnCopies = input.nextInt();
        book.returnBook(returnCopies);

        book.displayBookInfo();
    }
}