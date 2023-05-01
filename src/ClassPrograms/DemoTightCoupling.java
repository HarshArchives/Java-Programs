package ClassPrograms;

final class Studentz {
    void info() {
        System.out.println("Hello its a student!");
    }
}
public class DemoTightCoupling {
    public static void main(String[] args) {
        Studentz s = new Studentz();
        s.info();
    }
}
