package BridgeLabz.OOPSJava.AccessModifier;

public class Book {
    public String ISBN;
    protected String title;
    private String author;

    Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void displayBook() {
        System.out.println("ISBN: " + ISBN +
                           ", Title: " + title +
                           ", Author: " + author);
    }
}

class EBook extends Book {
    String format;

    EBook(String ISBN, String title, String author, String format) {
        super(ISBN, title, author);
        this.format = format;
    }

    public void displayEBook() {
        System.out.println("EBook - ISBN: " + ISBN +
                           ", Title: " + title +
                           ", Author: " + getAuthor() +
                           ", Format: " + format);
    }
}
