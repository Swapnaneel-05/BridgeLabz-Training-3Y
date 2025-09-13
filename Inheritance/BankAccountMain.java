package BridgeLabz.OOPSJava.Inheritance;

public class BankAccountMain {
    public static void main(String[] args) {
         SavingsAccount s = new SavingsAccount("S001", 15000, 5.0);
        CheckingAccount c = new CheckingAccount("C001", 8000, 2000);
        FixedDepositAccount f = new FixedDepositAccount("F001", 50000, 24);

        s.displayAccountType();
        s.displayDetails();
        
        c.displayAccountType();
        c.displayDetails();
        
        f.displayAccountType();
        f.displayDetails();
    }
}
