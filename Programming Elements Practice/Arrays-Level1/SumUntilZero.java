package BridgeLabz;

import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double[] arr=new double[10];
        int index=0;
        double sum=0;
        while(true){
            double n=sc.nextDouble();
            if(n<=0 || n==10){
                break;
            }
            else{
                arr[index]=n;
                index++;
            }
        }
        System.out.println("the numbers are: ");
        for(int i=0;i<index;i++){
            System.out.println(arr[i]);
            sum=sum+arr[i];
        }
        System.out.println("total value is: "+sum);
        sc.close();
    }
}
