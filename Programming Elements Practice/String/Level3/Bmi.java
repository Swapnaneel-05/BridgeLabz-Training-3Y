package BridgeLabz.Strings.Level3;

import java.util.Scanner;

public class Bmi {
    static String[] calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100.0;
        double bmi = weight / (heightM * heightM);
        bmi = Math.round(bmi * 100.0) / 100.0;
        String status;
        if (bmi < 18.5) status = "Underweight";
        else if (bmi < 25) status = "Normal";
        else if (bmi < 30) status = "Overweight";
        else status = "Obese";
        return new String[]{String.valueOf(weight), String.valueOf(heightCm), String.valueOf(bmi), status};
    }

    static String[][] processBMI(double[][] data) {
        String[][] result = new String[data.length][4];
        for (int i = 0; i < data.length; i++) {
            result[i] = calculateBMI(data[i][0], data[i][1]);
        }
        return result;
    }

    static void display(String[][] table) {
        System.out.printf("%-10s %-10s %-10s %-12s%n", "Weight", "Height", "BMI", "Status");
        for (String[] row : table) {
            System.out.printf("%-10s %-10s %-10s %-12s%n", row[0], row[1], row[2], row[3]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] members = new double[10][2];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight(kg) and height(cm) for person " + (i + 1) + ": ");
            members[i][0] = sc.nextDouble();
            members[i][1] = sc.nextDouble();
        }
        String[][] results = processBMI(members);
        display(results);
        sc.close();
    }
}
