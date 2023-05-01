package LabWorks;


class Test<T> {
    private final T object;

    Test(T object) {
        this.object = object;
    }

    public T getObject() {
        return object;
    }

}

public class LabWork9 {
    public static void main(String[] args) {
        Test<Integer> integerTest = new Test<Integer>(42);
        Test<String> stringTest = new Test<String>("Hello, World!");
        System.out.println("Integer: " + integerTest.getObject());
        System.out.println("String : " + stringTest.getObject());
    }
}






