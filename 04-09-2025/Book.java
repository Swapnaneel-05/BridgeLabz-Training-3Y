package BridgeLabz.OOPSJava.Sep4th;

public class Book {
    static String libraryName = "Central City Library";

    private String title;
    private String author;
    private final String isbn;

    Book(String title, String author, String isbn) {
        this.title = title;  
        this.author = author;
        this.isbn = isbn;
    }

    public void displayBookDetails() {
        if (this instanceof Book) {
            System.out.println("Library: " + libraryName +
                               ", Title: " + title +
                               ", Author: " + author +
                               ", ISBN: " + isbn);
        } else {
            System.out.println("Invalid book object.");
        }
    }

    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }
}
