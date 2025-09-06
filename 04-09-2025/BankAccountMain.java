package BridgeLabz.OOPSJava.Sep4th;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Ravi", 1001, 5000);
        BankAccount acc2 = new BankAccount("Neha", 1002, 8000);

        acc1.displayAccountDetails();
        acc2.displayAccountDetails();

        BankAccount.getTotalAccounts();
    }
}
