package BridgeLabz.OOPSJava.Inheritance;

public class BooksMain {
    public static void main(String[] args) {
        Author a1 = new Author("The Silent River", 2020, "Ravi Sharma", "Contemporary Indian novelist");
        Author a2 = new Author("Wings of Fire", 1999, "A.P.J. Abdul Kalam", "Former President of India and scientist");

        a1.displayInfo();
        System.out.println();
        a2.displayInfo();
    }    
}
