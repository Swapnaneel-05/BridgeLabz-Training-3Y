package BridgeLabz.Strings;

import java.util.Scanner;

public class EqualCheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine(),str2=sc.nextLine();
        System.out.println("BY charAt method: "+EqCheck(str1, str2));
        System.out.println("By builtin method: "+str1.equals(str2));
        sc.close();
    }
    public static boolean EqCheck(String str1,String str2){
        if(str1.length()!=str2.length()){
            return false;
        }
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i)!=str2.charAt(i)){
                return false;
            }
        }
        return true;
    }
}