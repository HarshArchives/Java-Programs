package ClassPrograms;

// A program to show the implementation of anonymous inner class using interfaces
interface Eatable {
    void eat();
}

class InterfaceAnonymousInnerClass {
    public static void main(String[] args) {
        // Object to the anonymous inner class
        Eatable e1 = new Eatable() {
            public void eat() {
                System.out.println("Nice Fruits");   // Instead of this we can also use lambda expressions
            }
        };
        e1.eat();
    }
}
