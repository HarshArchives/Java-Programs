package Strings;

import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String words = sc.nextLine();
        int Count = words.split("\\s").length;
        System.out.println("The number of words are : "+Count);
    }
}
