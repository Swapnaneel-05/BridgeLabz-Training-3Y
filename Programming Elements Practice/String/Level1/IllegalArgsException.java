package BridgeLabz.Strings;

import java.util.Scanner;

public class IllegalArgsException {
    public static void main(String[] args) {
        // Input
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s=sc.nextLine();

        // Method
        try{
            System.out.println(s.substring(4,0));
        }catch(Exception e){
            System.out.println(e.toString());
        }
        sc.close();
    }
}
