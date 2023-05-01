package Misc;

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

public class ATMInsufficient {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456789", 10000.0);
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter an amount to withdraw: ");
            long b = sc.nextLong();
            sc.close();
            account.withdraw(b); // Withdrawal amount greater than balance
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Current Balance is ₹" + account.getBalance());
        }
    }
}


