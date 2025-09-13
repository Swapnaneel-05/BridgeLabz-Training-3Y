package BridgeLabz.OOPSJava.Inheritance;

public class VehicleTypeMain {
    public static void main(String[] args) {
        ElectricVehicle ev = new ElectricVehicle("Tesla Model 3", 200, 75);
        PetrolVehicle pv = new PetrolVehicle("Honda Civic", 180, 50);

        ev.displayInfo();
        ev.charge();
        System.out.println("-----");
        pv.displayInfo();
        pv.refuel();
    }
}
