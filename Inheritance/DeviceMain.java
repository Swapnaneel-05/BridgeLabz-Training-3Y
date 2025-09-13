package BridgeLabz.OOPSJava.Inheritance;

public class DeviceMain {
    public static void main(String[] args) {
        Thermostat t1 = new Thermostat("TH123", "ON", 24);
        Thermostat t2 = new Thermostat("TH456", "OFF", 18);

        t1.displayStatus();
        System.out.println();
        t2.displayStatus();
    }
}
