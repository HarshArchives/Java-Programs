package PracticePrograms;

import java.util.Scanner;

public class FirstNnaturalnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        System.out.print("The first "+n+" natural numbers are : ");
        for(int i = 1 ; i <= n ; i++){
            System.out.print(i+" ");
        }
    }
}
