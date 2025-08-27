package BridgeLabz.ProblemStatement;

import java.util.Scanner;

public class RailwayResevation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of passengers: ");
        int passengers=sc.nextInt();

        System.out.println("Enter number of seats available: ");
        int seats=sc.nextInt();

        System.out.println(bookTrain(passengers, seats));
    }
    public static String bookTrain(int passengers,int seats){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<passengers;i++){
            System.out.println("Passenger "+(i+1)+ "make your choice.");
            String choice=sc.nextLine();
            switch (choice) {
                case "Rajdhani":
                    System.out.println("Tickit fare is $2000");
                    if(seats>0){
                        System.out.println(seats+" are available,Do you want to reserve?Type 'y' or 'n' ");
                    }
                    else{
                        System.out.println("Waiting List");
                        break;
                    }
                    String reserve=sc.nextLine();
                    switch (reserve) {
                        case "y":
                            seats--;
                            System.out.println("your ticket is booked");
                            break;
                        default:
                            break;
                    }
                    break;
                case "SuperFast":
                    System.out.println("Ticket fare is $1500");
                    if(seats>0){
                        System.out.println(seats+" are available,Do you want to reserve?Type 'y' or 'n' ");
                    }
                    else{
                        System.out.println("Waiting List");
                        break;
                    }
                    String reserve2=sc.nextLine();
                    switch (reserve2) {
                        case "y":
                            seats--;
                            System.out.println("your ticket is booked");
                            break;
                        default:
                            break;
                    }
                    break;
                case "InterCity":
                    System.out.println("Ticket fare is $400");
                    if(seats>0){
                        System.out.println(seats+" are available,Do you want to reserve?Type 'y' or 'n' ");
                    }
                    else{
                        System.out.println("Waiting List");
                        break;
                    }
                    String reserve3=sc.nextLine();
                    switch (reserve3) {
                        case "y":
                            seats--;
                            System.out.println("your ticket is booked");
                            break;
                        default:
                            break;
                    }
                    break;
                default:
                    break;
            }
        }
        if(seats==0){
            return "Train is full";
        }
        else{
            return seats+" Seats are available";
        }
    }
}
