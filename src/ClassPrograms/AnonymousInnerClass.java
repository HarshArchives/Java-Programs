package ClassPrograms;

// A program to show the implementation of anonymous inner class using abstract class
abstract class Person {
    abstract void eat();
}

class AnonymousInnerClass {
    public static void main(String[] args) {
        Person p1 = new Person() {
            void eat() {
                System.out.println("Nice Fruits");
            }
        };
        p1.eat();
    }
}
