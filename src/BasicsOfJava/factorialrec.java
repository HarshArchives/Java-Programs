package BasicsOfJava;
import java.util.Scanner;
public class factorialrec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int f = sc.nextInt();
        System.out.println("The factorial of "+f+" is : "+factorial(f));
    }

    static int factorial(int f){
        if (f==0)
            return 1;
        else
            return f*factorial(f-1);
    }

}
