package ClassPrograms;

public class Temp {
    private final int x;
    private final int y;
    private final int z;

    // zero arguments constructor
    public Temp() {
        this(0); // calling single integer parameterized constructor
    }

    // single integer parameterized constructor
    public Temp(int a) {
        this(a, a * 2); // calling two integer parameterized constructor
    }

    // two integer parameterized constructor
    public Temp(int a, int b) {
        this.x = a;
        this.y = b;
        this.z = a * b;
    }

    public static void main(String[] args) {
        Temp t1 = new Temp();
        Temp t2 = new Temp(2);
        Temp t3 = new Temp(4, 3);
        t1.display();
        t2.display();
        t3.display();
    }

    public void display() {
        System.out.println("\nx = " + x);
        System.out.println("\ny = " + y);
        System.out.println("\nz = " + z);
    }
}

