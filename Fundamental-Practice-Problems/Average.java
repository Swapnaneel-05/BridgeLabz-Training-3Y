package BridgeLabz;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
        System.out.println("Average: "+((a+b+c)/3));
        sc.close();
    }
}
