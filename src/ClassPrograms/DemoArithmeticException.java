package ClassPrograms;

public class DemoArithmeticException {
    public static void main(String[] args) {
        /*
        ** A program to show the implementation of Try-Catch statement
        */
        int a = 10, b = 20;
        System.out.println("Addition of "+a+" and "+b+" is: " + (a + b));
        b = 0;
        int result;
        try {
            if (b == 0) {
                throw new ArithmeticException("Avoid dividing by 0, The exception has been taken care of!");
            }
            result = a / b;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } System.out.println("Dividing anything by zero eventually gives Infinity");
    }
}