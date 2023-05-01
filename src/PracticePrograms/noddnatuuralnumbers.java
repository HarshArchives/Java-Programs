package PracticePrograms;

import java.util.Scanner;

public class noddnatuuralnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a = sc.nextInt();
        System.out.print("The first "+a+" odd natural numbers are : ");
        for(int i=1 ; i<=a ; i++){
            System.out.print((2*i-1)+" ");
        }
    }
}
