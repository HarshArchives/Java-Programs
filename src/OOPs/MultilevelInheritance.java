package OOPs;
//Multilevel Inheritance
class Shapes{
    public void area(){
        System.out.println("Displays Area : ");
    }
}

class Triangles extends Shape{
    public void area(int l , int h){
        System.out.println(1/2 * l * h);
    }
}

class EquilateralTriangle extends Triangles{
    public void area(int l , int h){
        System.out.println(1/2 * l * h);
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {

    }
}