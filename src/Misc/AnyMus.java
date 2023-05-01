package Misc;

abstract class Hi {
    abstract void sayHi();
}
public class AnyMus {
    public static void main(String[] args) {
        Hi h = new Hi() {
            void sayHi() {
                System.out.println("Hello");
            }
        };
    h.sayHi();
    }
}
