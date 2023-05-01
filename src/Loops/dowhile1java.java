package Loops;

import java.util.Scanner;

public class dowhile1java {
    public static void main(String[] args) {
        int number;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number : ");
            number = sc.nextInt();
            System.out.println("Here is your number : "+number);
        } while (number >= 0);
        System.out.println("The End\nGoodBye:)");
    }
}
