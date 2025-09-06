package BridgeLabz.OOPSJava.Sep4th;

public class VehicleMain {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Ravi", "Car", "MH12AB1234");

        v1.displayVehicleDetails();

        Vehicle.updateRegistrationFee(6000);
        System.out.println("After updating registration fee:");
        v1.displayVehicleDetails(); 
    }
}
