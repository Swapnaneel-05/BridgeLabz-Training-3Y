package September17;

public class BankAccountMain {
    public static void main(String[] args){
        BankAccount account1=new BankAccount(1001,6000,1453);

        System.out.println("Account Number: "+account1.getaccountnumber()+"\nBalance: "+account1.getbalance());

        account1.deposit(4000);
        account1.deposit(500);

        account1.withdrawl(400,1345);
        account1.withdrawl(7000,1453);

        System.out.println("Latest Balance: "+account1.getbalance());
    }
}
