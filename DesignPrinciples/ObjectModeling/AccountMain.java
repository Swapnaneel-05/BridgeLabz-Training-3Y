package BridgeLabz.OOPSJava.ObjectModeling;

public class AccountMain {
    public static void main(String[] args) {
        Bank bank = new Bank("SBI");

        Customer c1 = new Customer("Ayan");
        Customer c2 = new Customer("Ram");

        
        bank.openAccount(c1, "A1001", 5000);
        bank.openAccount(c1, "A1002", 2000);
        bank.openAccount(c2, "B2001", 10000);

        c1.viewBalance();
        c2.viewBalance();

        bank.showCustomers();
    }
}
