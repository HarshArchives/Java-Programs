package OOPs;

class Box {
    private int l, b, h;

    public void setDimension(int l, int b, int h) {
        this.l = l;
        this.b = b;
        this.h = h;
    }
    void display(){
        System.out.println(l+ " "+b+" " +h);
    }
}
public class ThisKeyword {
    public static void main(String[] args) {
        Box b1 = new Box();
        b1.setDimension(22,12,13);
        b1.display();
    }
}
