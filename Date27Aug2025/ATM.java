package BridgeLabz.ProblemStatement;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        System.out.println("Enter size: ");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();

        int[] transaction=new int[size];
        transaction=userInput(size, transaction);
        int balance=0;
        
        balance=userBalance(transaction, balance);
        
        // Output
        if(balance<0){
            System.out.println("Overdraft! The balance is: "+balance);
        }
        else{
            System.out.println("The balance is: "+balance);
        }
    } 
    public static int userBalance(int[] transactions,int balance){
        for(int i=0;i<transactions.length;i++){
            if(transactions[i]>0){
                System.out.println("deposite");
                balance+=transactions[i];
            }
            else{
                System.out.println("withdrawl");
                balance+=transactions[i];
            }
        }
        return balance;
    }
    
    
    public static int[] userInput(int size,int[] transactions){
        // User input
        System.out.println("transactions are: ");
        for(int i=0;i<transactions.length;i++){
            Scanner s= new Scanner(System.in);
            transactions[i]=s.nextInt();
        }
        return transactions;
    }
}