package BridgeLabz.OOPSJava;

public class MovieTicketMain {
    public static void main(String[] args) {
        MovieTicket book=new MovieTicket();

        book.bookTicket("Batman","F14", 250);
        book.display();
    }
}
