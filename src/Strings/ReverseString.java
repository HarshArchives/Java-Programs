package Strings;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = sc.nextLine();
        System.out.println("You Have Entered : "+str);
        String rev_Str = "";
        for(int i = 0; i < str.length() ; i++){
            rev_Str = str.charAt(i) + rev_Str;
        }
        System.out.println("Reversing The String...");
        System.out.println("The String in reversed order is : "+rev_Str);
    }
}
