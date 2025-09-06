package BridgeLabz.Strings.Level2;

import java.util.Scanner;

public class ShortLongWord {
    static int customLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {}
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

    static int[] findShortestLongest(String[][] table) {
        int shortestIdx = 0, longestIdx = 0;
        int shortest = Integer.parseInt(table[0][1]);
        int longest = Integer.parseInt(table[0][1]);
        for (int i = 1; i < table.length; i++) {
            int len = Integer.parseInt(table[i][1]);
            if (len < shortest) {
                shortest = len;
                shortestIdx = i;
            }
            if (len > longest) {
                longest = len;
                longestIdx = i;
            }
        }
        return new int[]{shortestIdx, longestIdx};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a line of text: ");
        String text = sc.nextLine();
        String[] words = customSplit(text);
        String[][] table = wordWithLength(words);
        int[] result = findShortestLongest(table);
        System.out.println("Shortest Word: " + table[result[0]][0] + " (" + table[result[0]][1] + ")");
        System.out.println("Longest Word: " + table[result[1]][0] + " (" + table[result[1]][1] + ")");
        sc.close();
    }
}
