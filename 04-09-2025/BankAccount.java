package BridgeLabz.OOPSJava.Sep4th;

public class BankAccount {
    static String bankName = "ABC Bank";
    private static int totalAccounts = 0;

    private String accountHolderName;
    private final int accountNumber;
    private double balance;

    BankAccount(String accountHolderName, int accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;         
        this.balance = balance;
        totalAccounts++;
    }

    public void displayAccountDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank: " + bankName +
                               ", Account Holder: " + accountHolderName +
                               ", Account Number: " + accountNumber +
                               ", Balance: " + balance);
        } else {
            System.out.println("Invalid account object.");
        }
    }

    public static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }
}
