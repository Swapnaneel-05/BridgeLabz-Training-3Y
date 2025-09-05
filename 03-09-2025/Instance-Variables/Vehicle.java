package BridgeLabz.OOPSJava.InstanceVariable;

public class Vehicle {
    String ownerName;
    String vehicleType;

    static double registrationFee = 5000.0;

    Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    void displayVehicleDetails() {
        System.out.println("Owner: " + ownerName +
                           ", Vehicle Type: " + vehicleType +
                           ", Registration Fee: " + registrationFee);
    }
    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Registration Fee updated to: " + registrationFee);
    }
}
