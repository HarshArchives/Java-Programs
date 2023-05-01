package ClassPrograms;
//  A program to show the implementation of multilevel inheritance

class Grandfather {
    String name_grandfather = "Johnson";
    int age_grandfather = 72;

    void MsgGf() {
        System.out.println("These are the properties of Grandfather\n");
    }

    void canPaint() {
        System.out.println("I am capable of painting");
    }

    void canWalk() {
        System.out.println("I am capable of walking for some miles");
    }
}

class Father extends Grandfather {
    String name_father = "Prince";
    int age_father = 52;

    void MsgF() {
        System.out.println("\nThese are the properties of Father\n");
    }

    void canJump() {
        System.out.println("I am capable of jumping\n");
    }

    void canDance() {
        System.out.println("I am capable of dancing");
    }

}

class Son extends Father {
    String name_son = "Steve";
    int age_son = 18;

    void showInfo() {
        System.out.println("Grandfather name is : " + name_grandfather + "" + "\n" + "Age is : " + age_grandfather + " \n");

        System.out.println("Father name is : " + name_father + "" + "\n" + "Age is : " + age_father + " \n");

        System.out.println("Son name is : " + name_son + "" + "\n" + "Age is : " + age_son + " \n");
    }

    void MsgS() {
        System.out.println("These are the properties of Son\n");
    }

    void canFight() {
        System.out.println("I am capable of fighting\n");
    }
}

public class DemoMultilevelInheritance {
    public static void main(String[] args) {
        Son s = new Son();
        s.showInfo();
        s.MsgGf();
        s.canPaint();
        s.canWalk();
        s.MsgF();
        s.canDance();
        s.canJump();
        s.MsgS();
        s.canFight();
    }
}
