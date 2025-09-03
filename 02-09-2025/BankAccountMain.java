package BridgeLabz.OOPSJava;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount account=new BankAccount("Rahul", 12356922, 120590);
        account.depositMoney(450);
        account.withdrawMoney(25000);
        account.displayBalance();
    }
}
