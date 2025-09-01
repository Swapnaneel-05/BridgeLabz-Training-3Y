package BridgeLabz.Strings;

import java.util.Scanner;

public class SubsString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the strings");
        String s1=sc.nextLine();

        System.out.println("enter start index: ");
        int start=sc.nextInt();

        System.out.println("Enter End Index: ");
        int end=sc.nextInt();

        String res=SBString(s1, start, end);
        System.out.println("By charAt method: "+EqCheck(s1, res));

        String s=s1.substring(start,end);
        System.out.println("By built-in method: "+EqCheck(s1, s));
        sc.close();
    }

    // Equals Check Using CharAt
    public static boolean EqCheck(String str1,String res){
    

        if(str1.length()!=res.length()){
            return false;
        }
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i)!=res.charAt(i)){
                return false;
            }
        }
        return true;
    }

    public static String SBString(String s1,int start,int end){
        String res="";
        if(EqCheck(s1,res)==false){
            return "false";
        }
        else{
            for(int i=start;i<end;i++){
                res+=s1.charAt(i); 
            }
        }
        return res;
    }
}
