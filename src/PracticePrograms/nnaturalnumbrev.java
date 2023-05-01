package PracticePrograms;

import java.util.Scanner;

public class nnaturalnumbrev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a = sc.nextInt();
        System.out.print("The first "+a+" natural numbers in reverse order are : ");
        for(int i = a ; i>=1 ; i--){
            System.out.print(i+" ");
        }
    }
}
