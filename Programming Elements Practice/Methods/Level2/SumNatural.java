package BridgeLabz.Method.Level2;

import java.util.Scanner;

public class SumNatural {
    public static int recursiveSum(int n) {
        if (n == 1) return 1;
        return n + recursiveSum(n - 1);
    }

    public static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a natural number (n > 0).");
        } else {
            int recSum = recursiveSum(n);
            int formSum = formulaSum(n);
            System.out.println("Recursive Sum: " + recSum);
            System.out.println("Formula Sum: " + formSum);
            if (recSum == formSum) {
                System.out.println("Both computations match!");
            } else {
                System.out.println("Mismatch found.");
            }
        }
        sc.close();
    }
}
