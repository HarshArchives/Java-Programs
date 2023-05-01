package LabWorks;

class Vehicle {
    final private String name;
    final private int year;

    public Vehicle(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return this.name;
    }

    public int getYear() {
        return this.year;
    }
}

class Car extends Vehicle {
    final private int numDoors;

    public Car(String name, int year, int numDoors) {
        super(name, year);
        this.numDoors = numDoors;
    }

    public int getNumDoors() {
        return this.numDoors;
    }
}

public class ThisSuper {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota Camry", 2021, 4);

        System.out.println("Car name: " + myCar.getName());
        System.out.println("Car year: " + myCar.getYear());
        System.out.println("Number of doors: " + myCar.getNumDoors());
    }
}