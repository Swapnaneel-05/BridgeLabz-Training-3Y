package BridgeLabz;
import java.util.Scanner;
public class CylinderVolume {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int h=sc.nextInt(),r=sc.nextInt();
        System.out.println("Volume "+(3.14*(r*r)*h));
        sc.close();
    }
}
