package ExceptionHandling;

public class TryCatch {
    public static void main(String[] args) {
        int[] marks = {97, 98, 97};
        try {
            System.out.println(marks[6]);
        } catch (Exception e) {
            //do something after catching
        }
        System.out.print("The Harsh Vardhan Pandey");
    }
}
