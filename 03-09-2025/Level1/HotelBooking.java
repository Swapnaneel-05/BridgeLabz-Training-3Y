package BridgeLabz.OOPSJava;

public class HotelBooking {
    String guestName;
    String roomType;
    int nights;


    HotelBooking() {
        this.guestName = "Guest";
        this.roomType = "Standard";
        this.nights = 1;
    }

    HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    void display() {
        System.out.println("Guest: " + guestName + ", Room: " + roomType + ", Nights: " + nights);
    }
}
