package BasicsOfJava;

import java.util.Scanner;
public class AgeDrive {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Age : ");
        int age = sc.nextInt();
        if(age >= 18)
        {
            System.out.println("They Can Drive");
        }
        else
        {
            System.out.println("They Cannot Drive :( ");
        }
    }
}
