package ClassPrograms;

import java.text.DecimalFormat;
import java.util.Scanner;

// program to demonstrate lambda expression
interface MyInterface {
    float getPiValue();
}

public class LambdaExpression {
    public static void main(String[] args) {
        MyInterface mi;
        mi = () -> 3.14F;
        float pi = mi.getPiValue();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius : ");
        int r = sc.nextInt();
        double area = pi * r * r;
        DecimalFormat df = new DecimalFormat();   // Using decimal format
        df.setMaximumFractionDigits(2);
        System.out.println("Area of circle with the radius "+r+" is : " + df.format(area));
//        System.out.printf("Area of circle with the radius %d is : %.2f", r, (area));
        sc.close();
    }
}
