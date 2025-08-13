package BridgeLabz;
import java.util.*;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt(),r=sc.nextInt(),t=sc.nextInt();
        System.out.println("Simple Interest: $"+((p*r*t)/100));
        sc.close();
    }
}
