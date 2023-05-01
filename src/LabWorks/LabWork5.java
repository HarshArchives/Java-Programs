package LabWorks;


class Arith1 {
    public void add(int a,int b) {
        System.out.println("The addition of "+a+" & "+b+" is: "+(a + b));
    }

    public void sub(int a,int b) {
        System.out.println("The difference of "+a+" & "+b+" is: "+(a - b));
    }

    public void mul(int a,int b) {
        System.out.println("The product of "+a+" & "+b+" is: "+(a * b));
    }
}

class Arith2 extends Arith1 {
    public void div(float a, float b) {
        System.out.println("The division of "+a+" & "+b+" is: "+(a / b));
    }
}

public class LabWork5 {
    public static void main(String[] args) {
        Arith2 a = new Arith2();
        a.add(12,14);
        a.sub(12,6);
        a.mul(12,4);
        a.div(42.f,7.f);
    }
}
