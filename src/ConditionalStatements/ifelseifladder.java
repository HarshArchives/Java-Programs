package ConditionalStatements;

import java.util.Scanner;

//A Program to show the entered number is positive or negative

public class ifelseifladder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        if(num > 0){
            System.out.println(num+" is Positive");
        }
        else if(num < 0){
            System.out.println(num+" is Negative");
        }
        else{
            System.out.println("Zero");
        }
    }
}
