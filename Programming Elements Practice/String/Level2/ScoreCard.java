package BridgeLabz.Strings.Level2;

import java.util.Scanner;

public class ScoreCard {
    static int[][] generateScores(int n) {
        int[][] scores = new int[n][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = (int)(Math.random() * 90) + 10; 
            }
        }
        return scores;
    }

    static double[][] calculateResults(int[][] scores) {
        int n = scores.length;
        double[][] results = new double[n][3];
        for (int i = 0; i < n; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double perc = (total / 300.0) * 100;
            results[i][0] = total;
            results[i][1] = Math.round(avg * 100.0) / 100.0;
            results[i][2] = Math.round(perc * 100.0) / 100.0;
        }
        return results;
    }

    static String[] assignGrades(double[][] results) {
        String[] grades = new String[results.length];
        for (int i = 0; i < results.length; i++) {
            double perc = results[i][2];
            if (perc >= 90) grades[i] = "A";
            else if (perc >= 80) grades[i] = "B";
            else if (perc >= 70) grades[i] = "C";
            else if (perc >= 60) grades[i] = "D";
            else grades[i] = "F";
        }
        return grades;
    }

    static void displayScoreCard(int[][] scores, double[][] results, String[] grades) {
        System.out.printf("%-8s %-8s %-8s %-8s %-8s %-10s %-12s %-8s%n", 
                          "ID", "Physics", "Chem", "Math", "Total", "Average", "Percentage", "Grade");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-8d %-8d %-8d %-8d %-8.0f %-10.2f %-12.2f %-8s%n", 
                              (i+1), scores[i][0], scores[i][1], scores[i][2], 
                              results[i][0], results[i][1], results[i][2], grades[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int[][] scores = generateScores(n);
        double[][] results = calculateResults(scores);
        String[] grades = assignGrades(results);
        displayScoreCard(scores, results, grades);
        sc.close();
    }
}
