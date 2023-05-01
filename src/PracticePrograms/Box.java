package PracticePrograms;

//First method

//class Baaks{
//    private int length,breadth,height;
//
//    public void setDimension(int l,int b,int h){
//        length = l;
//        breadth = b;
//        height = h;
//    }
//
//    public int showDimension(){
//        System.out.println("Length : "+length);
//        System.out.println("Breadth : "+breadth);
//        System.out.println("Height : "+height);
//        return 0;
//    }
//}
//public class Box {
//    public static void main(String[] args) {
//        Baaks b1 = new Baaks();
//        b1.setDimension(2,3,4);
//        b1.showDimension();
//    }
//}



//Alternate method

class Box{
    private int length,breadth,height;

    public void setDimension(int l,int b,int h){
        length = l;
        breadth = b;
        height = h;
    }

    public int showDimension(){
        System.out.println("The dimensions are : ");
        System.out.println("Height : "+length);
        System.out.println("Breadth : "+breadth);
        System.out.println("Length : "+height);
        return 69;
    }

    public static void main(String[] args) {
        Box b1 = new Box();
        b1.setDimension(3,5,12);
        b1.showDimension();
    }
}


