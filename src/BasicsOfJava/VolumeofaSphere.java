package BasicsOfJava;

import java.util.Scanner;

public class VolumeofaSphere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double PI = 3.1415;
        System.out.println("Enter the Radius : ");
        double radius = sc.nextInt();
        double volume = (4/3 * PI * radius * radius * radius);
        System.out.println("The Volume of the Sphere is : "+volume);
    }
}
