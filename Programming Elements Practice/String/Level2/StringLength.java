package BridgeLabz.Strings.Level2;

import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter String: ");
        String text=sc.nextLine();

        int customLength = getLength(text);

        
        int builtinLength = text.length();

        
        System.out.println("Length using user-defined method: " + customLength);
        System.out.println("Length using built-in length() method: " + builtinLength); 
        sc.close();
    }

    public static int getLength(String text){
        int count=0;
        try{
            while(true){
                text.charAt(count);
                count++;
            }
        }catch(Exception e){
            return count;
        }
    }
}
