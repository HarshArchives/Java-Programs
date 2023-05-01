package PracticePrograms;

import java.util.Scanner;

public class add {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("You Entered : "+a+" & "+b+" ");
        int sum = a + b;
        System.out.println("The Sum of "+a+" & "+b+" is : "+sum);
    }
}
