package BridgeLabz.OOPSJava;

public class BankAccount {
    String accountHolder;
    int accountNumber;
    double balance;
    public BankAccount(String accountHolder,int accountNumber,double balance){
        this.accountHolder=accountHolder;
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    public void depositMoney(double money){
        if(money<=0){
            System.out.println("Invalid amount");
        }
        else{
            balance=balance+money;
            System.out.println("Money Deposited- "+money);
        }
    }

    public void withdrawMoney(double money){
        if (balance==0){
            System.out.println("Insufficient Balance");
        }
        else if(balance>0 && balance>=money){
            balance-=money;
            System.out.println("Money Withdrawn- "+money);
        }
    }
    public void displayBalance(){
        System.out.println("Holder: "+accountHolder);
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Current Balance: "+balance);
    }
}