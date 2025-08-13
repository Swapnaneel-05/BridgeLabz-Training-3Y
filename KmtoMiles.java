package BridgeLabz;

import java.util.Scanner;

public class KmtoMiles {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double kilometer=sc.nextInt();
        System.out.println("Miles: "+(kilometer*0.621371));
        sc.close();
    }
}
