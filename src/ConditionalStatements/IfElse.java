package ConditionalStatements;

public class IfElse {
    public static void main(String[] args) {
        boolean isSunup = true;
        if (isSunup == true){
            System.out.println("It's Day");
        }
        else {
            System.out.println("It's Night");
        }

        int age = 30;
        if (age > 18){
            System.out.println("Can Drive");
        }
        else {
            System.out.println("Can't Drive!");
        }
    }
}
