package BridgeLabz.OOPSJava.Inheritance;

interface Refuelable {
    void refuel();
}

class VehicleType {
    String model;
    int maxSpeed;

    public VehicleType(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    public void displayInfo() {
        System.out.println("Model: " + model + ", Max Speed: " + maxSpeed + " km/h");
    }
}

class ElectricVehicle extends VehicleType {
    int batteryCapacity;

    public ElectricVehicle(String model, int maxSpeed, int batteryCapacity) {
        super(model, maxSpeed);
        this.batteryCapacity = batteryCapacity;
    }

    public void charge() {
        System.out.println("Charging the electric vehicle with battery capacity: " + batteryCapacity + " kWh.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Electric Vehicle, Battery Capacity: " + batteryCapacity + " kWh");
    }
}

class PetrolVehicle extends VehicleType implements Refuelable {
    int fuelTankCapacity;

    public PetrolVehicle(String model, int maxSpeed, int fuelTankCapacity) {
        super(model, maxSpeed);
        this.fuelTankCapacity = fuelTankCapacity;
    }

    @Override
    public void refuel() {
        System.out.println("Refueling the petrol vehicle with tank capacity: " + fuelTankCapacity + " liters.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Petrol Vehicle, Fuel Tank Capacity: " + fuelTankCapacity + " liters");
    }
}
