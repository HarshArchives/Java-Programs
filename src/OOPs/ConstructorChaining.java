package OOPs;

class A{
    public A(){      //Constructor
        System.out.println("A 1");
    }
}

class B extends A{
    //constructor_chaining
    public B(){
        this(4);
        System.out.println("B 1");
    }
    public B(int k){
        System.out.println("B 2");
    }
}
public class ConstructorChaining {
    public static void main(String[] args) {
        B b1 = new B();  //Object Creation
    }
}
