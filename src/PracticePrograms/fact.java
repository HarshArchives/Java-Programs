package PracticePrograms;

import java.util.Scanner;

public class fact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        if(n>=0) {
            int f = 1;

            while (n != 0) {
                f = f * n;
                n--;
            }

            System.out.println("The factorial is : "+f);
        }
        else
            System.out.println("Invalid Input");
    }
}
