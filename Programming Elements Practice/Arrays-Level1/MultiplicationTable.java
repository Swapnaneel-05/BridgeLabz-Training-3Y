package BridgeLabz;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        int[] nums= new int[10];
        for(int i=0;i<10;i++){
            nums[i]=n*(i+1);
        }
        for(int i=0;i<10;i++){
            System.out.println(n+" * "+(i+1)+" = "+nums[i]);
        }
        sc.close();
    }
}
