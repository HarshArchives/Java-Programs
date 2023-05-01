package OOPs;
//Abstract class (Khayali Pulav)
abstract class Animal{
    abstract void walk();
}

class Horse extends Animal{
    public void walk(){
        System.out.println("Horse Walks on 4 legs!\nRuns Very fast\n");
    }
}

class Chicken extends Animal{
    public void walk(){
        System.out.println("Chicken Walks on 2 legs!");
    }
}
public class abstractclass {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
        Chicken chicken = new Chicken();
        chicken.walk();
    }
}
