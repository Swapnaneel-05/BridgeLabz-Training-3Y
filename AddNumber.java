package BridgeLabz;

import java.util.Scanner;

public class AddNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt();
        System.out.println("Answer: "+(a+b));
        sc.close();
    }
}
