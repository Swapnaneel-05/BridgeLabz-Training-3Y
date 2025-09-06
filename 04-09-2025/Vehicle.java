package BridgeLabz.OOPSJava.Sep4th;

public class Vehicle {
    static double registrationFee = 5000;

    private String ownerName;
    private String vehicleType;
    private final String registrationNumber;

    Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    public void displayVehicleDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Owner: " + ownerName +
                               ", Vehicle Type: " + vehicleType +
                               ", Registration Number: " + registrationNumber +
                               ", Registration Fee: " + registrationFee);
        } else {
            System.out.println("Invalid vehicle object");
        }
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }
}
