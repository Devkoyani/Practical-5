import java.io.FileReader;
import java.io.IOException;

public class Pr5_2 {
    public static void main(String[] args) throws IOException {
        FileReader fr = null;
        try {
            fr = new FileReader("C:\\AAA Shortcut\\Java programs\\Assignment 5\\demo.txt");

            int temp;
            while ((temp = fr.read()) != -1) {
                System.out.print((char) temp);
            }
            System.out.println("\nProgram successfully executed");
        } finally {
            if (fr != null)
                fr.close();
        }
    }
}