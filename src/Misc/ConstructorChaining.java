package Misc;

public class ConstructorChaining {
    final private String name;
    final private int age;
    final private String address;

    public ConstructorChaining() {
        this("John Doe", 30, "123 Main St");
    }

    public ConstructorChaining(String name) {
        this(name, 30, "123 Main St");
    }

    public ConstructorChaining(String name, int age) {
        this(name, age, "123 Main St");
    }

    public ConstructorChaining(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public static void main(String[] args) {
        ConstructorChaining obj1 = new ConstructorChaining();
        ConstructorChaining obj2 = new ConstructorChaining("Jane Doe");
        ConstructorChaining obj3 = new ConstructorChaining("Bob Smith", 25);
        ConstructorChaining obj4 = new ConstructorChaining("Alice Brown", 35, "456 Elm St");

        System.out.println(obj1.name + " " + obj1.age + " " + obj1.address);
        System.out.println(obj2.name + " " + obj2.age + " " + obj2.address);
        System.out.println(obj3.name + " " + obj3.age + " " + obj3.address);
        System.out.println(obj4.name + " " + obj4.age + " " + obj4.address);
    }
}

