package BridgeLabz.Method.Level1;

import java.util.Scanner;

public class SpringSeason {
    public static boolean isSpringSeason(int month, int day) {
        if (month == 3 && day >= 20) return true;
        if (month == 4 || month == 5) return true;
        if (month == 6 && day <= 20) return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Month: ");
        int month=sc.nextInt();
        System.out.println("Enter day: ");
        int day=sc.nextInt();
        if (isSpringSeason(month, day))
            System.out.println("Its a Spring Season");
        else
            System.out.println("Not a Spring Season");

        sc.close();
    }   
}
