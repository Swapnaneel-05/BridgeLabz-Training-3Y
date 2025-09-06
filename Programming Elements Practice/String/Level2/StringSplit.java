package BridgeLabz.Strings.Level2;

import java.util.Scanner;

public class StringSplit {
    static int customLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }
        return count;
    }

    static String[] customSplit(String text) {
        int count = 1;
        for (int i = 0; i < customLength(text); i++) {
            if (text.charAt(i) == ' ') count++;
        }
        String[] words = new String[count];
        int start = 0, idx = 0;
        for (int i = 0; i < customLength(text); i++) {
            if (text.charAt(i) == ' ') {
                words[idx++] = text.substring(start, i);
                start = i + 1;
            }
        }
        words[idx] = text.substring(start);
        return words;
    }

    static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a line of text: ");
        String text = sc.nextLine();
        String[] arr1 = customSplit(text);
        String[] arr2 = text.split(" ");
        boolean isEqual = compareArrays(arr1, arr2);
        System.out.println("Custom Split:");
        for (String w : arr1) System.out.println(w);
        System.out.println("Built-in Split:");
        for (String w : arr2) System.out.println(w);
        System.out.println("Arrays Match: " + isEqual);
        sc.close();
    }
}
