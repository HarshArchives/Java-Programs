package Strings;

public class strCompareto {
    public static void main(String[] args) {
        String s1 = "A";
        String s2 = "ab";
        int out1 = s1.compareTo(s2);
        System.out.println(out1);
        int out2 = s1.compareToIgnoreCase(s2);
        System.out.println(out2);
    }
}
