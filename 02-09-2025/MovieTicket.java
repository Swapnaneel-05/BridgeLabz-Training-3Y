package BridgeLabz.OOPSJava;

public class MovieTicket {
    String movieName;
    String seatNumber;
    int price;
    public MovieTicket(){
        this.movieName="";
        this.seatNumber="";
        this.price=0;
    }
    public void bookTicket(String movieName, String seatNumber, int price){
        this.movieName=movieName;
        this.seatNumber=seatNumber;
        this.price=price;
        System.out.println("Ticket booked");
    }
    public void display(){
        System.out.println("Movie: "+movieName);
        System.out.println("Seat Number: "+seatNumber);
        System.out.println("Price: "+price);
    }
}
