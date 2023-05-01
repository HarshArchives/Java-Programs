package ClassPrograms;

//A program to show the implementation of abstraction

abstract class Shapes {
    public abstract void area();
}
class Rectangle extends Shapes {
    float l = 2.0f ,b = 7.0f;
    public void area() {
        float ar = l * b;
        System.out.println("Area of Rectangle is : "+ar);
    }
}

class Triangle extends Shapes {
    double base = 12.7f ,height = 2.0f;
    public void area() {
        double ar = (0.5f) * base * height;
        System.out.println("Area of Triangle is : "+ar);
    }

}

class Circle extends Shapes {
    float radius = 3.3f;
    final double pi = 3.14;
    double ar = pi * radius * radius;
    public void area() {
        System.out.println("Area of Circle is : "+ar);
    }
}

public class UseShapes {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.area();
        Triangle t = new Triangle();
        t.area();
        Circle c = new Circle();
        c.area();
    }
}