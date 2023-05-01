package ClassPrograms;

import java.io.*;
public class TryWithMultipleResources {
    public static void main(String[] args) {
        InputStream iS = null;
        OutputStream oS = null;
        try {
            iS = new FileInputStream("/Users/harshvardhanpandey/IdeaProjects/Java Programs/TextFiles/abc.txt");
            oS = new FileOutputStream("/Users/harshvardhanpandey/IdeaProjects/Java Programs/TextFiles/xyz.txt");
            DataInputStream dS = new DataInputStream(iS);
            int n = iS.available();
            byte[] bA = new byte[n];
            dS.read(bA);
            System.out.println("Read Successfully:)");
            String str = "Hello World ,This is my first program using try with multiple resources.";
            bA = str.getBytes();
            oS.write(bA);
            System.out.println(("Written Successfully!"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Resource are closed and message has been written into the xyz.txt");
            try {
                if (oS != null) {
                    oS.close();
                }
                if (iS != null) {
                    iS.close();
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
