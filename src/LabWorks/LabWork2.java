package LabWorks;

interface A {
    void displayA();
}

interface B {
    void displayB();
}

class MyClass implements A, B {
    public void displayA() {
        System.out.println("This is method displayA() from interface A.");
    }

    public void displayB() {
        System.out.println("This is method displayB() from interface B.");
    }
}

public class LabWork2 {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.displayA();
        obj.displayB();
    }
}

