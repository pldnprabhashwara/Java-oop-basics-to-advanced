package oop11;

public class Book {
    private int bookId;           // removed static
    private String title;
    private String author;
    private int availableCopies;

    Book(int bookId, String title, String author, int availableCopies) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.availableCopies = availableCopies;
    }

    public int getBookId() { return bookId; }
    public void setBookId(int bookId) { this.bookId = bookId; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getAuthor() { return author; }

    public int getAvailableCopies() { return availableCopies; }

    public void borrowBook(int copies) {       // removed static
        if (copies > 0 && copies <= availableCopies) {
            availableCopies -= copies;
            System.out.println("Book Borrowed! Remaining copies: " + availableCopies);
        } else {
            System.out.println("Not enough copies available!");
        }
    }

    public void returnBook(int copies) {
        if (copies > 0) {
            availableCopies += copies;
            System.out.println("Book Returned! Remaining copies: " + availableCopies);
        } else {
            System.out.println("Invalid return amount!");
        }
    }

    public void displayBookInfo() {            // removed static
        System.out.println("\n--- Book Details ---");
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Available Copies: " + availableCopies);  // added
    }
}

