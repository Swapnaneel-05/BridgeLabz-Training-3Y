package BridgeLabz;

import java.util.Scanner;

public class Level2Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double base = input.nextDouble();
        double height = input.nextDouble();
        double areaInCm = 0.5 * base * height;
        double areaInInches = areaInCm / 6.4516;
        System.out.println("The area of triangle in square cm is " + areaInCm + " while in square inches is " + areaInInches);
        input.close();
    }
}
