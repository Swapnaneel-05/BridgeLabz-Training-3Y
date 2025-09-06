package BridgeLabz.Strings.Level2;

import java.util.Scanner;

public class Trim {
    static int[] findTrimIndices(String str) {
        int start = 0, end = str.length() - 1;
        while (start <= end && str.charAt(start) == ' ') start++;
        while (end >= start && str.charAt(end) == ' ') end--;
        return new int[]{start, end};
    }

    static String customSubstring(String str, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += str.charAt(i);
        }
        return result;
    }

    static boolean customCompare(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string with spaces: ");
        String text = sc.nextLine();
        int[] indices = findTrimIndices(text);
        String trimmedCustom = customSubstring(text, indices[0], indices[1]);
        String trimmedBuiltIn = text.trim();
        boolean equal = customCompare(trimmedCustom, trimmedBuiltIn);
        System.out.println("Custom Trimmed: " + trimmedCustom);
        System.out.println("Built-in Trimmed: " + trimmedBuiltIn);
        System.out.println("Are both equal? " + equal);
        sc.close();
    }
}
