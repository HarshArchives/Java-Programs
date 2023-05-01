package Misc;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Cohesion {
    void add(int a, int b) {
        int sum = a + b;
        System.out.println("Addition of "+a+" & "+b+" is : "+sum);
    }

    void findVowels(char ch) {
        switch (ch) {
            case 'a', 'e', 'i', 'o', 'u' -> System.out.println(ch + " is " + "a vowel :)");
            default -> System.out.println(ch + " is not a vowel :(");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Adding the numbers...");
        Cohesion d1 = new Cohesion();
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        d1.add(a,b);
        System.out.print("Enter a character : ");
        char c = sc.next().charAt(0);
        System.out.println("Checking whether '"+c+"' is a vowel or not! ");
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        d1.findVowels(c);
        sc.close();
    }
}


