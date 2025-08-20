package BridgeLabz;
import java.util.*;
public class VoteElegibility {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] age=new int[5];
        for(int i=0;i<age.length;i++){
            age[i]=sc.nextInt();
        }
        for(int j:age){
            if(j >= 18){
                System.out.println("The Student with the age "+j+" can vote");
            }
            else{
                System.out.println("The Student with age "+j+" cannot vote");
            }
        }
        sc.close();
    }
}
