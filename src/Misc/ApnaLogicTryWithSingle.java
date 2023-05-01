package Misc;

import java.io.FileOutputStream;
import java.io.IOException;

public class ApnaLogicTryWithSingle {
    public static void main(String[] args) throws IOException {
        FileOutputStream fout = null;  //Initializing with null
        try {
            fout = new FileOutputStream("/Users/harshvardhanpandey/IdeaProjects/Java Programs/TextFiles/abc.txt");
            String text = "Hello World ,This is my first program using try with single resources.";
            byte[] arr = text.getBytes();
            fout.write(arr);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Resource are closed and message has been written into the abc.txt");

            if (fout != null) {
                fout.close();
            }

        }
    }
}
