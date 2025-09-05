package BridgeLabz.OOPSJava.AccessModifier;

public class BookMain {
    public static void main(String[] args) {
        Book b1 = new Book("123-456", "Java Basics", "James Gosling");
        b1.displayBook();
        b1.setAuthor("Joshua Bloch");
        System.out.println("Updated Author: " + b1.getAuthor());

        EBook eb1 = new EBook("789-101", "Effective Java", "Joshua Bloch", "PDF");
        eb1.displayEBook();
    }
}
