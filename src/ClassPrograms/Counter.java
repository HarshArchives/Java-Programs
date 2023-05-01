package ClassPrograms;




public class Counter {
    public static int x = 0;
    Counter(){
        x++;
        System.out.println(x);
    }
    public static void main(String[] args) {
        System.out.println("Program to demonstrate counter which will count the numbers from 1");
        Counter c1  =  new Counter();
        Counter c2  =  new Counter();
        Counter c3  =  new Counter();
        Counter c4  =  new Counter();
        Counter c5  =  new Counter();
    }
}
