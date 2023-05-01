package LabWorks;


import java.util.Scanner;

class InsufficientFundsException extends Exception {
    public InsufficientFundsException() {
        super("Insufficient funds to withdraw from account");
    }
}

class BankAccount {
    final private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException();
        }
        balance -= amount;
        System.out.println("Successfully withdrew ₹" + amount + " from account no. " + accountNumber);
    }

    public double getBalance() {
        return balance;
    }
}

public class LabWork10 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456785", 1000.0);
        try {
            account.withdraw(200.0); // Withdrawal amount greater than balance
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Current Balance is ₹" + account.getBalance());
        }
    }
}

