package BridgeLabz.OOPSJava.InstanceVariable;

public class VehicleMain {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Rahul", "Car");

        v1.displayVehicleDetails();

        Vehicle.updateRegistrationFee(8000.0);

        v1.displayVehicleDetails();
    }
}
