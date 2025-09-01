package BridgeLabz.Strings;

import java.util.Scanner;

public class ArrayOutofBound {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size=sc.nextInt();
        sc.nextLine();
        String[] arr=new String[size];
        for(int i=0;i<size;i++){
            System.out.println("enter the element: ");
            arr[i]=sc.nextLine();
        }

        try{
            System.out.println(arr[size]);
        }catch(Exception e){
            System.out.println(e.toString());
        }

        sc.close();
    }
}
