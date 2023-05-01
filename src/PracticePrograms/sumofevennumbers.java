package PracticePrograms;

import java.util.Scanner;

public class sumofevennumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a = sc.nextInt();
        int sum = 0;
        for (int i=1 ; i<=a ; i++){
            sum+=2*i;
        }
        System.out.println("The sum of first "+a+" even natural numbers is : "+sum);
    }
}
