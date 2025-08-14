package BridgeLabz;

public class Level1Q7 {
    public static void main(String[] args) {
        double radiusKm = 6378;
        double volumeKm3 = (4.0 / 3.0) * 3.14 * Math.pow(radiusKm, 3);
        double radiusMiles = radiusKm / 1.609;
        double volumeMiles3 = (4.0 / 3.0) * 3.14 * Math.pow(radiusMiles, 3);
        System.out.println("The volume of earth in cubic kilometers is " + volumeKm3 + " and cubic miles is " + volumeMiles3);
    }
}
