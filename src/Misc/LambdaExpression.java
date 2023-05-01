package Misc;

import java.util.Scanner;

interface MyInterface {
    double getValue();
}

public class LambdaExpression {
    public static void main(String[] args) {
        MyInterface mi;
        mi = () -> 3.14;//lambda expression
        double p1 = mi.getValue();
        Scanner kp = new Scanner(System.in);
        System.out.print("enter radius of a circle: ");
        int r = kp.nextInt();
        double area = p1 * r * r;
        System.out.println("area of the circle with the radius " + r + " is : " + area);
        kp.close();
    }
}