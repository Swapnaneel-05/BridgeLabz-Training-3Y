package BridgeLabz.Strings;

import java.util.Scanner;

public class StringToArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String: ");
        String st=sc.nextLine();

        char[] builtin=st.toCharArray();

        char[] usermade=getArray(st);

        System.out.println(EqCheck(builtin, usermade));

        sc.close();

    }
    public static char[] getArray(String st){
        char[] ch=new char[st.length()];
        for(int i=0;i<st.length();i++){
            ch[i]=st.charAt(i);
        }
        return ch;
    }
    public static boolean EqCheck(char[] str1,char[] str2){
        if(str1.length!=str2.length){
            return false;
        }
        for(int i=0;i<str1.length;i++){
            if(str1[i]!=str2[i]){
                return false;
            }
        }
        return true;
    }
}
