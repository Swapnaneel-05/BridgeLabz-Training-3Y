package BridgeLabz.Method.Level3;

import java.util.Arrays;

public class NumCheck3 {
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

    public static int[] reverseDigits(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }

    public static boolean compareArrays(int[] arr1, int[] arr2) {
        return Arrays.equals(arr1, arr2);
    }

    public static boolean isPalindrome(int number) {
        int[] digits = getDigits(number);
        int[] reversed = reverseDigits(digits);
        return compareArrays(digits, reversed);
    }

    public static boolean isDuckNumber(int number) {
        int[] digits = getDigits(number);
        for (int d : digits) {
            if (d == 0) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int num = 70707;
        System.out.println("Count of digits: " + countDigits(num));
        System.out.println("Digits: " + Arrays.toString(getDigits(num)));
        System.out.println("Reversed: " + Arrays.toString(reverseDigits(getDigits(num))));
        System.out.println("Is Palindrome: " + isPalindrome(num));
        System.out.println("Is Duck Number: " + isDuckNumber(num));
    }
}
