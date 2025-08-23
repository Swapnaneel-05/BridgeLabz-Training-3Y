package BridgeLabz;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int originalNum = num;  

        boolean isNegative = num < 0;
        num = Math.abs(num);
        int temp = num;
        int count = (temp == 0) ? 1 : 0;
        while (temp > 0) {
            count++;
            temp /= 10;
        }
        int[] digits = new int[count];
        int index = 0;
        while (index < count) {
            digits[index] = num % 10; 
            num /= 10;
            index++;
        }

        System.out.print("Reversed number: ");
        if (isNegative) {
            System.out.print("-");
        }
        for (int i = 0; i < count; i++) { 
            System.out.print(digits[i]);
        }
        System.out.println();
    }
}
