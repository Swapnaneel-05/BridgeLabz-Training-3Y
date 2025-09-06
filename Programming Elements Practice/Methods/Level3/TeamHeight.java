package BridgeLabz.Method.Level3;

import java.util.Random;

public class TeamHeight {
    public static int findSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    public static double findMean(int[] arr) {
        return (double) findSum(arr) / arr.length;
    }

    public static int findShortest(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static int findTallest(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] heights = new int[11];
        Random rand = new Random();

        System.out.println("Heights of players:");
        for (int i = 0; i < heights.length; i++) {
            heights[i] = 150 + rand.nextInt(101); // range 150–250
            System.out.print(heights[i] + " ");
        }
        System.out.println();

        System.out.println("Shortest height: " + findShortest(heights) + " cm");
        System.out.println("Tallest height: " + findTallest(heights) + " cm");
        System.out.printf("Mean height: %.2f cm\n", findMean(heights));
    }
}
