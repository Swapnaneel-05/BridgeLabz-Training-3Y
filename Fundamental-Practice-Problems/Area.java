package BridgeLabz;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int radius=sc.nextInt();
        System.out.println("Area="+ (3.14*(radius*radius)));
        sc.close();
    }
}
