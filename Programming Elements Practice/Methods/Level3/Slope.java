package BridgeLabz.Method.Level3;

import java.util.Scanner;

public class Slope {
    static boolean checkCollinearSlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        // Instead of division (which may cause divide by zero), use cross multiplication
        return (y2 - y1) * (x3 - x2) == (y3 - y2) * (x2 - x1);
    }

    // Method to check collinearity using area of triangle formula
    static boolean checkCollinearArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        int area = x1 * (y2 - y3) +
                   x2 * (y3 - y1) +
                   x3 * (y1 - y2);
        return area == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input 3 points
        System.out.print("Enter x1 y1: ");
        int x1 = sc.nextInt(), y1 = sc.nextInt();
        System.out.print("Enter x2 y2: ");
        int x2 = sc.nextInt(), y2 = sc.nextInt();
        System.out.print("Enter x3 y3: ");
        int x3 = sc.nextInt(), y3 = sc.nextInt();

        System.out.println("Points: A(" + x1 + "," + y1 + "), B(" + x2 + "," + y2 + "), C(" + x3 + "," + y3 + ")");

        // Check using slope method
        if (checkCollinearSlope(x1, y1, x2, y2, x3, y3)) {
            System.out.println("Collinear (using slope method)");
        } else {
            System.out.println("Not Collinear (using slope method)");
        }

        // Check using area of triangle method
        if (checkCollinearArea(x1, y1, x2, y2, x3, y3)) {
            System.out.println("Collinear (using area of triangle method)");
        } else {
            System.out.println("Not Collinear (using area of triangle method)");
        }

        sc.close();
    }
}
