package OOPs;

abstract class car {
    abstract void start();
}

class BMW extends car {
    void start() {
        System.out.println("BMW is starting...Vroom Vroom!");
    }
}

class Mazda extends car {
    void start() {
        System.out.println("Mazda is starting...Vroom Vroom!");
    }
}

public class AbstractCars {
    public static void main(String[] args) {
        BMW bmw = new BMW();
        bmw.start();
        Mazda maz = new Mazda();
        maz.start();
    }
}