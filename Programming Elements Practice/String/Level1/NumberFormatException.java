package BridgeLabz.Strings;

import java.util.Scanner;

public class NumberFormatException {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String s=sc.nextLine();

        try{
            System.out.println(Integer.parseInt(s));
        }catch(Exception e){
            System.out.println(e.toString());
        }
        sc.close();
    }
}
