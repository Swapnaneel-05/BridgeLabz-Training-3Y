package BridgeLabz;

import java.util.Scanner;

public class MeanHeight {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double[] arr=new double[11];
        double sum=0.0;
        for(int i=0;i<11;i++){
            arr[i]=sc.nextDouble();
            sum=sum+arr[i];
        }
        double mean=sum/11.0;
        System.out.println("mean height= "+mean);
    }
}
