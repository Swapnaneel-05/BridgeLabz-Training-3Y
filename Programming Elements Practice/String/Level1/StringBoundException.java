package BridgeLabz.Strings;

import java.util.Scanner;

public class StringBoundException {
    public static void main(String[] args) {
        // Input
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String s=sc.nextLine();

        // Method
        try{
            System.out.println(s.charAt(s.length()));
        }catch(Exception e){
            System.out.println("exception handeled");
        }
        sc.close();
    }
}
