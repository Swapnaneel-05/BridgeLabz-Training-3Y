package BridgeLabz.OOPSJava.ObjectModeling;

public class LibraryBookMain {
    public static void main(String[] args) {
        LibraryBook b1 = new LibraryBook("Harry Potter", "JK Rowlings");
        LibraryBook b2 = new LibraryBook("Hunger Games", "Suzanne Collins");
        LibraryBook b3=new LibraryBook("Salt", "Helen Frost");


        InnerLibraryBook l1 = new InnerLibraryBook("State Library");
        InnerLibraryBook l2 = new InnerLibraryBook("Capital Library");

        l1.addBooks(b1);
        l1.addBooks(b2);
        l2.addBooks(b3);


        l1.display();

        l2.display();
    }
}
