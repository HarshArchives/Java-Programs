package PracticePrograms;

import java.util.Scanner;

public class greaterbwtwono {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a>b){
            System.out.println("The greatest number is : "+a);
        }
        else if(b>a){
            System.out.println("The greatest number is : "+b);
        }
        else{
            System.out.println(a+" and "+b+" are equal");
        }
//        int max = (a>b) ?  a : b;   //ternary operator
//        System.out.println("The Greatest number is : "+max);
    }
}
