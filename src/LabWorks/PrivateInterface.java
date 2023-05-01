package LabWorks;


interface Sayable {
    private static void saySomething() {
        System.out.println("Hello...I'm Private Method");
    }

    default void say() {
        saySomething(); // calling the private method
    }
}

public class PrivateInterface implements Sayable {
    public static void main(String[] args) {
        Sayable s = new PrivateInterface();
        s.say(); // Calling the function
    }
}
