package ClassPrograms;
// program to demonstrate the template class
class Test<T> {
    T obj1;
    Test(T obj) {
        obj1 = obj;
    }
    public T getObject() {
        return obj1;
    }
}

public class TemplateClass {
    public static void main(String[] args) {
        // code to create an object to store integer datatype
        Test<Integer> obji = new Test<>(20);
        // code to create an object to store string datatype
        Test<String> objs = new Test<>("Harsh");
        Test<Float> objf = new Test<>(111f);
        // printing the values
        System.out.println("Integer: " + obji.getObject());
        System.out.println("String : " + objs.getObject());
        System.out.println("Float : " + objf.getObject());
    }
}
