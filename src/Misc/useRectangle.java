package Misc;
import Misc.Rectangle;
public class useRectangle {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.setL(2);
        r1.setB(3);
        r1.setH(5);
        System.out.print("Length is : " +r1.getL() + "\n" + "Breadth is : " +r1.getB() + "\n" + "Height is : " +r1.getH());
        System.out.println("\nVolume is : "+r1.getVolume());
    }
}
