package ClassPrograms;


public class DemoLowCohesion {
    void add(int a, int b) {
        int sum = a + b;
        System.out.println("Addition of "+a+" & "+b+" is : "+sum);
    }
    void findVowels(char ch) {
        char x = ch;
        // switch (x) {
        //            case 'a':
        //            case 'e':
        //            case 'i':
        //            case 'o':
        //            case 'u':
        //                System.out.println(x + "is" + " a vowel");
        //                break;
        //            default:
        //                System.out.println(x+"is not a vowel");
        //        }

        //using enhanced switch case statement
        switch (x) {
            case 'a', 'e', 'i', 'o', 'u' -> System.out.println(x + " is " + "a vowel");
            default -> System.out.println(x + " is not a vowel");
        }
    }

    public static void main(String[] args) {
        DemoLowCohesion d1 = new DemoLowCohesion();
        d1.add(12,16);
        d1.findVowels('e');
    }
}
