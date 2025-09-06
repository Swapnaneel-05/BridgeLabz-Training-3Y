package BridgeLabz.OOPSJava.Sep4th;

public class BookMain {
    public static void main(String[] args) {
        Book b1 = new Book("The Alchemist", "Paulo Coelho", "ISBN001");

        Book.displayLibraryName();
        b1.displayBookDetails();
    }
    
}
