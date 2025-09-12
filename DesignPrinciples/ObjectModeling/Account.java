package BridgeLabz.OOPSJava.ObjectModeling;

import java.util.*;

class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance!");
        }
    }
}

class Customer{
    private String name;
    private List<Account> accounts;

    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void viewBalance() {
        System.out.println("Balances for " + name + ":");
        for (Account account : accounts) {
            System.out.println("Account " + account.getAccountNumber() +
                               " has balance: " + account.getBalance());
        }
    }
}

class Bank{
    private String bankName;
    private List<Customer> customers;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.customers = new ArrayList<>();
    }

    public void openAccount(Customer customer, String accountNumber, double initialDeposit) {
        Account account = new Account(accountNumber, initialDeposit);
        customer.addAccount(account);

        if (!customers.contains(customer)) {
            customers.add(customer); // Link customer to the bank
        }

        System.out.println("Account " + accountNumber + " opened for " + customer.getName()
                           + " in " + bankName);
    }

    public void showCustomers() {
        System.out.println("Customers of " + bankName + ":");
        for (Customer customer : customers) {
            System.out.println(customer.getName());
        }
    }
}
