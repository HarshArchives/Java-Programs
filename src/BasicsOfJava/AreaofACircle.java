package BasicsOfJava;

import java.util.Scanner;

public class AreaofACircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double PI = 3.14;
        System.out.print("Enter Radius : ");
        double radius = sc.nextInt();
        double area = PI * radius * radius;
        System.out.println("The area of the circle is : "+area);
    }
}
