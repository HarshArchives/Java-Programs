package OOPs;
//Single Level Inheritance
class Shape{
    private double length;
    private double height;
    public void setArea(double length,double height){
        this.length=length;
        this.height=height;
    }
    public double getArea() {
        double ar = (length * height)/2;
        return (ar);
    }
}

//class Triangle extends Shape{
//    public double ggetArea(double length , double height){
//        double ar = (length * height)/2;
//        return (ar);
//
//    }
//}


public class SingleLevelInheritance {
    public static void main(String[] args) {
        Shape s1 = new Shape();
        s1.setArea(2,3);
        System.out.println("The area is : "+s1.getArea());
    }
}
