package BridgeLabz.Strings.Level2;

import java.util.Scanner;

public class WordLength {
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

    static String[][] wordWithLength(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(customLength(words[i]));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a line of text: ");
        String text = sc.nextLine();
        String[] words = customSplit(text);
        String[][] table = wordWithLength(words);
        System.out.printf("%-15s %-10s%n", "Word", "Length");
        for (String[] row : table) {
            System.out.printf("%-15s %-10d%n", row[0], Integer.parseInt(row[1]));
        }
        sc.close();
    }
}
