package ClassPrograms;

// Program to demonstrate method overriding
class Swapping {
    void swap(int a, int b) {
        System.out.println("Before Swapping:");
        System.out.println("The Value Of a is : " + a);
        System.out.println("The Value Of b is : " + b);

        int temp;  // Using a temp variable
        temp = a;
        a = b;
        b = temp;

        System.out.println("After Swapping:");
        System.out.println("TheValue Of a is : " + a);
        System.out.println("The Value Of b is : " + b);
    }
}

class ArithNew extends Swapping {
    void swap(int a, int b) {
        System.out.println("Before Swapping:");
        System.out.println("The Value Of a is : " + a);
        System.out.println("The Value Of b is : " + b);

        a = (a + b) - (b = a);

        System.out.println("After Swapping:");
        System.out.println("The Value Of a is : " + a);
        System.out.println("The Value Of b is : " + b);
    }
}

public class FunctionOverriding {
    public static void main(String[] args) {
        ArithNew a1 = new ArithNew();
        a1.swap(10, 30);
    }
}
