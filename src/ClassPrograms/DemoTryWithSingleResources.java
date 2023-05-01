package ClassPrograms;

// Java Program for try-with-resources having single resource

import java.io.FileOutputStream;


public class DemoTryWithSingleResources {
    public static void main(String[] args) {
        try (FileOutputStream fout = new FileOutputStream("./TextFiles/sqlsingle.txt")) {
            String text = "Hello World ,This is my first program using try with single resources.";
            byte[] arr = text.getBytes();
            fout.write(arr);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Resource are closed and message has been written into the sqlsingle.txt");
        }
    }
}

