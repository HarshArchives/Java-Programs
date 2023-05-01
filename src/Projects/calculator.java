package Projects;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("\nEnter First number : ");
            double a = sc.nextInt();
            System.out.print("Enter Second Number : ");
            double b = sc.nextInt();

            System.out.println("You Have Entered " + a + " & " + b + " \n");
            System.out.println("Important Instructions To Operate The Calculator!");
            System.out.println("1->Addition\n2->Subtraction\n3->Multiplication\n4->Division\n");
            System.out.print("Enter Your Choice : ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.print("Adding The Numbers");
                    for (int i = 0; i < 3; i++) {
                        try {
                            TimeUnit.SECONDS.sleep(1);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        System.out.print(".");
                    }
                    System.out.print("\nThe sum of " + a + " & " + b + " is : " + (a + b));
                }
                case 2 -> {
                    System.out.println("Subtracting The Numbers...");
                    for (int i = 0; i < 3; i++) {
                        try {
                            TimeUnit.SECONDS.sleep(1);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        System.out.print(".");
                    }
                    System.out.println("\nThe difference of " + a + " & " + b + " is : " + (a - b));
                }
                case 3 -> {
                    System.out.println("Multiplying The Numbers...");
                    for (int i = 0; i < 3; i++) {
                        try {
                            TimeUnit.SECONDS.sleep(1);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        System.out.print(".");
                    }
                    System.out.println("\nThe product of " + a + " & " + b + " is : " + (a * b));
                }
                case 4 -> {
                    System.out.println("Dividing The Numbers...");
                    for (int i = 0; i < 3; i++) {
                        try {
                            TimeUnit.SECONDS.sleep(1);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        System.out.print(".");
                    }
                    System.out.println("\nThe division of " + a + " by " + b + " is : " + (a / b));
                }

                default -> System.out.println("Invalid Choice!");
            }
            System.out.print("\nDo you want to Continue(Y/N) : ");
            String c = "";
            while (!(c.equalsIgnoreCase("n") || c.equalsIgnoreCase("y"))) {
                c = sc.nextLine();
                if (c.equalsIgnoreCase("n")) {
                    System.out.println("Terminating The Program...");
                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("Program Terminated Successfully!");
                    return;
                }
            }
        }
    }
}


