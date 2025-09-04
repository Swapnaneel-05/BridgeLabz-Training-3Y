package BridgeLabz.OOPSJava;

public class HotelBookingMain {
    public static void main(String[] args) {
        HotelBooking b1 = new HotelBooking();
        HotelBooking b2 = new HotelBooking("Rahul", "Premium", 3);
        HotelBooking b3 = new HotelBooking(b2);

        b1.display();
        b2.display();
        b3.display();
    }
}
