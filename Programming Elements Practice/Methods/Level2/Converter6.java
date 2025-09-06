package BridgeLabz.Method.Level2;

public class Converter6 {
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }

    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32;
    }

    public static double convertPoundsToKilograms(double pounds) {
        return pounds * 0.453592;
    }

    public static double convertKilogramsToPounds(double kilograms) {
        return kilograms * 2.20462;
    }

    public static double convertGallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }

    public static double convertLitersToGallons(double liters) {
        return liters * 0.264172;
    }

    public static void main(String[] args) {
        System.out.println("100°F = " + convertFahrenheitToCelsius(100) + " °C");
        System.out.println("37°C = " + convertCelsiusToFahrenheit(37) + " °F");
        System.out.println("150 pounds = " + convertPoundsToKilograms(150) + " kg");
        System.out.println("68 kg = " + convertKilogramsToPounds(68) + " pounds");
        System.out.println("10 gallons = " + convertGallonsToLiters(10) + " liters");
        System.out.println("25 liters = " + convertLitersToGallons(25) + " gallons");
    }
}
