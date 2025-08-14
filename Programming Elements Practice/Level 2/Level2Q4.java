package BridgeLabz;

import java.util.Scanner;

public class Level2Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double feet = input.nextDouble();
        double yards = feet / 3;
        double miles = feet / 5280;
        System.out.println("The distance is " + yards + " yards and " + miles + " miles for " + feet + " feet");
        input.close();
    }
}
