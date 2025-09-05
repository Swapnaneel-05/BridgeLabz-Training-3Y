package BridgeLabz.OOPSJava.AccessModifier;

public class BankAccount {
    public int accountNumber;
    protected String accountHolder;
    private double balance;

    BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Invalid balance amount.");
        }
    }

    public void displayAccount() {
        System.out.println("Account Number: " + accountNumber +
                           ", Holder: " + accountHolder +
                           ", Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(int accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    public void displaySavingsAccount() {
        System.out.println("Savings Account - Account Number: " + accountNumber +
                           ", Holder: " + accountHolder +
                           ", Balance: " + getBalance() +
                           ", Interest Rate: " + interestRate + "%");
    }
}
