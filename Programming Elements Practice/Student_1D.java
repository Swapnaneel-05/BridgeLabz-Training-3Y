package BridgeLabz;

import java.util.Scanner;

public class Student_1D{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of students
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        // Arrays for marks, percentage, and grade
        int[] physics = new int[n];
        int[] chemistry = new int[n];
        int[] maths = new int[n];
        double[] percentage = new double[n];
        char[] grade = new char[n];

        // Input marks
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1));

            // Physics
            do {
                System.out.print("Physics: ");
                physics[i] = sc.nextInt();
                if (physics[i] < 0) System.out.println("Marks must be positive!");
            } while (physics[i] < 0);

            // Chemistry
            do {
                System.out.print("Chemistry: ");
                chemistry[i] = sc.nextInt();
                if (chemistry[i] < 0) System.out.println("Marks must be positive!");
            } while (chemistry[i] < 0);

            // Maths
            do {
                System.out.print("Maths: ");
                maths[i] = sc.nextInt();
                if (maths[i] < 0) System.out.println("Marks must be positive!");
            } while (maths[i] < 0);

            // Calculate percentage
            int total = physics[i] + chemistry[i] + maths[i];
            percentage[i] = total / 3.0;

            // Assign grade
            if (percentage[i] >= 90) grade[i] = 'A';
            else if (percentage[i] >= 75) grade[i] = 'B';
            else if (percentage[i] >= 50) grade[i] = 'C';
            else grade[i] = 'D';
        }

        // Display results
        System.out.println("\n--- Student Report ---");
        for (int i = 0; i < n; i++) {
            System.out.printf("Student %d -> Physics: %d, Chemistry: %d, Maths: %d, Percentage: %.2f%%, Grade: %c%n",
                    (i + 1), physics[i], chemistry[i], maths[i], percentage[i], grade[i]);
        }   
    }
}