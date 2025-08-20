package BridgeLabz;

import java.util.Scanner;

public class PositiveNegative{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr=new int[5];
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                if(arr[i]%2==0){
                    System.out.println("The number "+arr[i]+" is Positive & Even");
                }
                else{
                    System.out.println("The number "+arr[i]+" is Positive & Odd");
                }
            }
            else if(arr[i]<0){
                System.out.println("Negative");
            }
            else{
                System.out.println("zero");
            }
        }
        if(arr[0]>arr[4]){
            System.out.println("first is greater");
        }
        else if(arr[0]<arr[4]){
            System.out.println("first is smaller");
        }
        else{
            System.out.println("They are equal");
        }

        sc.close();
    }
    
}
