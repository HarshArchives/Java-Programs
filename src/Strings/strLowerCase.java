package Strings;

import java.util.Scanner;

public class strLowerCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str = sc.nextLine();
        System.out.println("String in the Lowercase format is : "+str.toLowerCase());
    }
}
