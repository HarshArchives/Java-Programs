package PracticePrograms;

import java.util.Scanner;

class Addition {
    void add(int a,int b) {
        System.out.println("The sum of "+a+" & "+b+" is : "+(a+b));
    }
}
class FindVowel {
    void isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch+" is a vowel!");
                break;
            default:
                System.out.println(ch+" is not a vowel!");
        }
    }
}

public class DemoHighCohesion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers for addition: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.print("Enter a character: ");
        char c = sc.next().charAt(0);
        Addition a = new Addition();
        FindVowel fv = new FindVowel();
        a.add(x,y);
        fv.isVowel(c);
    }
}
