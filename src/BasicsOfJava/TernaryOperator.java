package BasicsOfJava;

public class TernaryOperator {
    public static void main(String[] args) {
        int a = 16,b = 12;

        System.out.println("First Number : "+a);
        System.out.println("Second Number : "+b);

        //Ternary operator
        int result = (a>b) ? (a+b) : (a-b);

        System.out.println("The Result is : "+result);
    }
}
