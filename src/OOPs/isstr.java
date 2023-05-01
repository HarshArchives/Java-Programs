package OOPs;

public class isstr {
    String a;
    public boolean isString(String a) {
        this.a=a;
        return true;
    }

    public static void main(String[] args) {
        isstr s = new isstr();
        System.out.println(s.isString("ABC"));
    }
}
