package BridgeLabz.OOPSJava.AccessModifier;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount(1001, "Ravi", 5000);
        b1.displayAccount();
        b1.setBalance(7000);
        System.out.println("Updated Balance: " + b1.getBalance());

        SavingsAccount s1 = new SavingsAccount(2001, "Neha", 10000, 4.5);
        s1.displaySavingsAccount();
    }
}
