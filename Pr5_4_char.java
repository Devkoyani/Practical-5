import java.io.FileReader;

public class Pr5_4_char {
    public static void main(String[] args) {
        FileReader reader = null; // read() reads character by character
        try {
            reader = new FileReader("C:\\AAA Shortcut\\Java programs\\Assignment 5\\5_1.txt");
            int fChar;
            while ((fChar = reader.read()) != -1) {
                System.out.println((char) fChar);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}