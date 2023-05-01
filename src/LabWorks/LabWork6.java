package LabWorks;

// Define Father interface
interface Father {
    double getHeight();

    double getWeight();

    String getColor();

    String[] getProperty();

    void canDance();

    void canDrive();

    void canSwim();

    void canWalk();

    void canTalk();

    void canEat();
}

// Define Mother interface
interface Mother {
    double getHeight();

    double getWeight();

    String getColor();

    String[] getProperty();

    void canSing();

    void canCook();

    void canPaint();
}

// Define Child class that implements both Father and Mother interfaces
class Child implements Father, Mother {
    private final double height;
    private final double weight;
    private final String color;
    private final String[] property;

    // Constructor to initialize Child attributes
    public Child(double height, double weight, String color, String[] property) {
        this.height = height;
        this.weight = weight;
        this.color = color;
        this.property = property;
    }

    // Implement Father interface methods
    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public String[] getProperty() {
        return property;
    }

    public void canDance() {
        System.out.println("I can dance like my father!");
    }

    public void canDrive() {
        System.out.println("I can drive like my father!");
    }

    public void canSwim() {
        System.out.println("I can swim like my father!");
    }

    public void canWalk() {
        System.out.println("I can walk like my father!");
    }

    public void canTalk() {
        System.out.println("I can talk like my father!");
    }

    public void canEat() {
        System.out.println("I can eat like my father!");
    }

    // Implement Mother interface methods
    public void canSing() {
        System.out.println("I can sing like my mother!");
    }

    public void canCook() {
        System.out.println("I can cook like my mother!");
    }

    public void canPaint() {
        System.out.println("I can paint like my mother!");
    }
}


// Create an instance of the Child class and call some methods
public class LabWork6 {
    public static void main(String[] args) {
        Child myChild = new Child(150.0, 50.0, "brown", new String[]{"smart", "athletic"});
        myChild.canDance();
        myChild.canSing();
        myChild.canCook();
        myChild.canSwim();
        myChild.canDrive();
        myChild.canPaint();
    }
}


