package ClassPrograms;

// program to demonstrate default function
interface Polygon {
    void getArea();
    default void getSides() {
        System.out.println("I can get the sides of a polygon");
    }
}

class Rectangles implements Polygon {
    public void getArea() {
        double length = 5;                      // Giving length
        double breadth = 4;                     // Giving breadth
        double result = length * breadth;       // Applying the formula
        System.out.println("The area of rectangle is : " + result);
    }

    public void getSides() {
        System.out.println("Rectangle has 4 sides");
    }
}

class Square implements Polygon {
    public void getArea() {
        double side = 3;
        double result = side * side;
        System.out.println("The area of square is : " + result);
    }

    public void getSides() {
        System.out.println("Square has 4 sides");
    }
}

public class DefaultKeyword {
    public static void main(String[] args) {
        Polygon p1 = new Rectangles();
        p1.getSides();
        p1.getArea();
        System.out.println();
        Polygon p2 = new Square();
        p2.getSides();
        p2.getArea();
    }
}