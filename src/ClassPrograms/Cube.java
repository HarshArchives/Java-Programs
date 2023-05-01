package ClassPrograms;

import java.util.Scanner;
public class Cube {
    public static int x;
    public static void ComputeCube(int n){
        int result = n*n*n;
        System.out.println("Cube of "+n+" is : "+result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to compute cube : ");
        x = sc.nextInt();
        ComputeCube(x);
    }
}




