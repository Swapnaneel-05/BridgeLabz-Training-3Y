package BridgeLabz.Method.Level3;

import java.util.Arrays;

public class NumCheck2 {
    public static int countDigits(int number) {
        return String.valueOf(Math.abs(number)).length();
    }

    public static int[] getDigits(int number) {
        String str = String.valueOf(Math.abs(number));
        int[] digits = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            digits[i] = str.charAt(i) - '0';
        }
        return digits;
    }

    public static int sumOfDigits(int number) {
        int[] digits = getDigits(number);
        int sum = 0;
        for (int d : digits) sum += d;
        return sum;
    }

    public static int sumOfSquaresOfDigits(int number) {
        int[] digits = getDigits(number);
        int sum = 0;
        for (int d : digits) sum += Math.pow(d, 2);
        return sum;
    }

    public static boolean isHarshadNumber(int number) {
        int sum = sumOfDigits(number);
        return number % sum == 0;
    }

    public static int[][] digitFrequency(int number) {
        int[] digits = getDigits(number);
        int[][] freq = new int[10][2];
        for (int i = 0; i < 10; i++) {
            freq[i][0] = i;
        }
        for (int d : digits) {
            freq[d][1]++;
        }
        return freq;
    }

    public static void main(String[] args) {
        int number = 378;

        System.out.println("Number: " + number);
        System.out.println("Digits: " + Arrays.toString(getDigits(number)));
        System.out.println("Sum of digits: " + sumOfDigits(number));
        System.out.println("Sum of squares of digits: " + sumOfSquaresOfDigits(number));
        System.out.println("Harshad Number? " + isHarshadNumber(number));

        int[][] freq = digitFrequency(number);
        System.out.println("Digit Frequencies:");
        for (int[] row : freq) {
            if (row[1] > 0) {
                System.out.println("Digit " + row[0] + " occurs " + row[1] + " times");
            }
        }
    }
}
