package BridgeLabz;

import java.util.Scanner;

public class Multiplication69 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number=sc.nextInt();
        int multi[]=new int[4];
        for(int i=0;i<4;i++){
            multi[i]=number*(i+6);
        }
        for(int i=0;i<4;i++){
            System.out.println(number+"*"+(i+6)+"="+multi[i]);
        }
        sc.close();
    }
}
