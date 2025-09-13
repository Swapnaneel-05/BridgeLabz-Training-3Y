package BridgeLabz.OOPSJava.Inheritance;

public class VehiclesMain {
    public static void main(String[] args) {
        Vehicles[] vehicles = new Vehicles[3];

        vehicles[0] = new Car(180, "Petrol", 5);
        vehicles[1] = new Truck(120, "Diesel", 15);
        vehicles[2] = new Motorcycle(100, "Petrol", true);

        for (Vehicles v : vehicles) {
            v.displayInfo();
            System.out.println();
        }
    }
}
