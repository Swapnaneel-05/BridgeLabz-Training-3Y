package BridgeLabz;

import java.util.Scanner;

public class Level1Q10 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your height in centimeters: ");
        int heightCm=input.nextInt();
        double totalInches = heightCm / 2.54;
        int feet = (int) (totalInches / 12);
        double inches = totalInches % 12;
        System.out.println("Your Height in cm is " + heightCm + " while in feet is " + feet + " and inches is " + inches);
        input.close();
    }
}
