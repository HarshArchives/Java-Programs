package BasicsOfJava;

public class SwapNumSum {
    public static void main(String[] args) {
//        int a = 10, b = 30;
//        System.out.println("Before Swapping:");
//        System.out.println("The Value Of a is : " + a);
//        System.out.println("The Value Of b is : " + b);
//
//        int temp;     //temp variable
//        temp = a;   //a = (a + b) - (b = a) alternate logic or
//        a = b;
//        b = temp;
//
//        System.out.println("After Swapping:");
//        System.out.println("The Value Of a is : " + a);
//        System.out.println("The Value Of b is : " + b);
//
//        int sum = a + b;
//        System.out.println("The sum of " + a + " & " + b + " is : " + sum);

        int a = 10, b = 30;
        System.out.println("Before Swapping:");
        System.out.println("The Value Of a is : " + a);
        System.out.println("The Value Of b is : " + b);

        a = (a + b) - (b = a);

        System.out.println("After Swapping:");
        System.out.println("The Value Of a is : " + a);
        System.out.println("The Value Of b is : " + b);

    }
}
