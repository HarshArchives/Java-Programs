package ClassPrograms;

// A program to demonstrate private functions in interfaces
interface Sayable {
    private static void sayPolitely() {
        System.out.println("This from private static function : I can say politely");
    }

    default void say() {
        saySomething();  // Calling private function
        sayPolitely();   // Calling private static function
    }

    private void saySomething() {
        System.out.println("This is from private function : I can say Something\n");
    }
}

public class PrivateFunctionsInInterfaces implements Sayable {
    public static void main(String[] args) {
        Sayable s;
        s = new PrivateFunctionsInInterfaces();
        s.say();
    }
}