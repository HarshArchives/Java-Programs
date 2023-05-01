package OOPs;

class persons {
    String name;
    int age;

    void walk() {          //Functions or Methods
        System.out.println(name+ " is walking...");
    }

    void eat() {
        System.out.println(name+ " is eating...");
    }

    void walk(int kadam) {
        System.out.println(name+ " walked " +kadam + " steps");
    }
}
public class classobjects {
    public static void main(String[] args) {
        persons p1 = new persons();     //Object Creation(Real world entity)
        p1.name = "Harsh";
        p1.age = 18;

        System.out.println("Name : "+ p1.name + " \nAge is : " +p1.age);

        persons p2 = new persons();
        p2.name = "Muna";
        p2.age = 17;

        System.out.println("Name : "+p2.name + " \nAge is : " +p2.age);

        p1.walk(27);    //Function calling(passing value through the arguments)
        p2.walk();            //Compile Time Polymorphism
        p2.eat();
    }
}
