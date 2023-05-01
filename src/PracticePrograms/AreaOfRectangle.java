package PracticePrograms;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length & breadth of the rectangle : ");
        float l = sc.nextFloat();
        float b = sc.nextFloat();
        float ar = l * b;
        System.out.println("The area of rectangle having length "+l+" & breadth "+b+" is : "+ar);
    }
}
