package Projects;

import java.util.Scanner;

public class BankManagement {
    private static double balance = 0;
    private static double previousTransaction = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to XYZ Bank!");
        System.out.println("---------------------");
        System.out.print("Please enter your name: ");
        String customerName = scanner.nextLine();
        System.out.println("Hello, " + customerName + "!");
        boolean exit = false;
        while (!exit) {
            System.out.println("---------------------");
            System.out.println("Please choose an option:");
            System.out.println("1. Check balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Previous transaction");
            System.out.println("5. Exit");
            int option = scanner.nextInt();
            switch (option) {
                case 1 -> checkBalance();  // Using enhanced switch case statement
                case 2 -> deposit();
                case 3 -> withdraw();
                case 4 -> previousTransaction();
                case 5 -> exit = true;
                default -> System.out.println("Invalid option! Please choose a valid option.");
            }
        }
        System.out.println("Thank you for banking with us!");
    }

    private static void checkBalance() {
        System.out.println("---------------------");
        System.out.println("Your balance is: ₹" + balance);
    }

    private static void deposit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("---------------------");
        System.out.print("Please enter the amount you want to deposit: ");
        double amount = scanner.nextDouble();
        if (amount <= 0) {
            System.out.println("Invalid amount! Please enter a valid amount.");
            return;
        }
        balance += amount;
        previousTransaction = amount;
        System.out.println("---------------------");
        System.out.println("Successfully deposited: ₹" + amount);
        System.out.println("Your new balance is : ₹" + balance);
    }

    private static void withdraw() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("---------------------");
        System.out.print("Please enter the amount you want to withdraw: ");
        double amount = scanner.nextDouble();
        if (amount <= 0) {
            System.out.println("Invalid amount! Please enter a valid amount.");
            return;
        }
        if (amount > balance) {
            System.out.println("Insufficient balance! Please enter a valid amount.");
            return;
        }
        balance -= amount;
        previousTransaction = -amount;
        System.out.println("---------------------");
        System.out.println("Successfully withdrawn: ₹" + amount);
        System.out.println("Your new balance is: ₹" + balance);
    }

    private static void previousTransaction() {
        System.out.println("---------------------");
        if (previousTransaction == 0) {
            System.out.println("No previous transaction found.");
        } else if (previousTransaction > 0) {
            System.out.println("Previous transaction: Deposited ₹" + previousTransaction);
        } else {
            System.out.println("Previous transaction: Withdrawn ₹" + Math.abs(previousTransaction));
        }
    }
}
