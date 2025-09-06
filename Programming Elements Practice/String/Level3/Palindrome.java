package BridgeLabz.Strings.Level3;

import java.util.Scanner;

public class Palindrome {
    static boolean isPalindromeIterative(String text) {
        int start = 0, end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }

    static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) return true;
        if (text.charAt(start) != text.charAt(end)) return false;
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    static boolean isPalindromeCharArray(String text) {
        char[] original = text.toCharArray();
        char[] reversed = reverse(text);
        for (int i = 0; i < original.length; i++) {
            if (original[i] != reversed[i]) return false;
        }
        return true;
    }

    static char[] reverse(String text) {
        char[] rev = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            rev[i] = text.charAt(text.length() - 1 - i);
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        System.out.println("Iterative check: " + (isPalindromeIterative(text) ? "Palindrome" : "Not Palindrome"));
        System.out.println("Recursive check: " + (isPalindromeRecursive(text, 0, text.length() - 1) ? "Palindrome" : "Not Palindrome"));
        System.out.println("CharArray check: " + (isPalindromeCharArray(text) ? "Palindrome" : "Not Palindrome"));

        sc.close();
    }
}
