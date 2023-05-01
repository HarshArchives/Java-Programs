package ClassPrograms;


// Program to demnostrate function overloading

class Arith {
    void add(int a, int b) {
        System.out.println("The sum of " + a + " & " + b + " is: " + (a + b) + "\n");
    }

    void add(int a, int b, int c) {
        System.out.println("The sum of " + a + "," + b + " & " + c + " is: " + (a + b + c) + "\n");
    }

    void add(float a, float b) {
        System.out.println("The sum of " + a + " & " + b + " is: " + (a + b));
    }
}

public class ArithPoly {
    public static void main(String[] args) {
        Arith a1 = new Arith();
        a1.add(12, 12);
        a1.add(1, 4, 7);
        a1.add(1.23F, 2.35F);
    }
}