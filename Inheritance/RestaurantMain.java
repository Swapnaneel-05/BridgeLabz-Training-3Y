package BridgeLabz.OOPSJava.Inheritance;

public class RestaurantMain {
    public static void main(String[] args) {
        Chef chef = new Chef("SpiceHub", 101, "Italian");
        Waiter waiter = new Waiter("SpiceHub", 101, 12);

        chef.displayInfo();
        chef.performDuties();
        waiter.displayInfo();
        waiter.performDuties();
    }
}
