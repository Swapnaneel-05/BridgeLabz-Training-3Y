// Write a program to simulate online shopping
package BridgeLabz.ProblemStatement;

import java.util.Scanner;

public class OnlineShopingCart {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean onlinecartavailable=true;

        while(onlinecartavailable){
            int customer;

            do{
                System.out.println("Enter number of items: ");
                customer=sc.nextInt();
            }while(customer<1);

            int total=0;
            for(int i=0;i<customer;i++){
                System.out.println("Item  NO. "+(i+1));

                System.out.println("Select Product: ");
                System.out.println("1.Kitchen Suplies - $1900");
                System.out.println("2.Furnitures - $6000");
                System.out.println("3.Clothings - $500");
                System.out.println("4.Electronics - $2500");
                int choice=sc.nextInt();
                switch (choice) {
                    case 1:
                        total+=1900;
                        break;
                    case 2:
                        total+=6000;
                        break;
                    case 3:
                        total+=500;
                        break;
                    case 4:
                        total+=2500;
                        break;
                    default:
                        System.out.println("Invalid Input");
                }
            }
            if(total>5000){
                System.out.println("Before discount price: "+total);
                double discount= total*0.9;
                System.out.println("After discount price: "+discount);
            }
            
            System.out.println("are there more customer?(y/n)");
            sc.nextLine();
            String moreCustomer=sc.nextLine();
            if(moreCustomer.equals("n")){
                onlinecartavailable=false;
            }
        }
    }
}
