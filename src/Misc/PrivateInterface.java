package Misc;

interface Sayable {
    default void say() {
        saySomething();
    }

    // Private method inside interface
    private void saySomething() {
        System.out.println("Hello... I'm private method");
    }
}

class hero implements Sayable {
    public void saySomething() {
        System.out.println("Hello ");
    }
}

public class PrivateInterface extends hero implements Sayable {
    public static void main(String[] args) {
        Sayable s;
        s = new PrivateInterface();
        s.say();
        hero h;
        h = new PrivateInterface();
        h.saySomething();
    }
}
