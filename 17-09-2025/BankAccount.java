package September17;

public class BankAccount {
    private int accountnumber;
    private double balance;
    private int pin;

    public BankAccount(int accountnumber,double balance,int pin){
        this.accountnumber=accountnumber;
        this.pin=pin;
        this.balance=balance;
    }

//    balance
    public double getbalance(){
        return balance;
    }
//  AccountNumber
    public int getaccountnumber(){
        return accountnumber;
    }

//   Deposit
    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("Money Deposited: "+amount);
        }
        else {
            System.out.println("Invalid input");
        }
    }

//   WithDrawl by checking pin
    public void withdrawl(double amount,int checkpin){
        if(checkpin!=pin){
            System.out.println("Wrong pin");
        }
        else if(amount>balance){
            System.out.println("Insufficient balance");
        }
        else{
            balance-=amount;
            System.out.println("Money withdrawn: "+amount);
        }
    }
}
