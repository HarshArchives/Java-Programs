package ClassPrograms;

class A {
    int a,b;
    public void Sum(int a, int b) {
        System.out.println("Sum of "+a+" & "+b+" is : "+ (a+b));
    }
    public void sub(int a,int b) {
        System.out.println("Sub of "+a+" & "+b+" is : "+ (a-b));
    }
}

//Inheriting the Class A properties in Class B
class B extends A {
    double a,b;
    public void div(double a, double b) {
        System.out.println("Divison is : "+ (a/b));
    }

}
public class SingleInheritanceArith {
    public static void main(String[] args) {
        B b1 = new B();
        b1.Sum(10,12);
        b1.sub(12,2);
        b1.div(12,6);
    }
}