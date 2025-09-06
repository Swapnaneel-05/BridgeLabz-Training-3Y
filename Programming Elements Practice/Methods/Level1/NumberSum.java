package BridgeLabz.Method.Level1;

import java.util.Scanner;

public class NumberSum {
    public static int findSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        int sum = findSum(n);
        System.out.println("Sum of first " + n + " natural numbers: " + sum);
        sc.close();
    }
}
