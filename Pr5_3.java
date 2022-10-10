import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Pr5_3 {
    public static void main(String[] args) throws Exception {
        FileInputStream in = new FileInputStream("C:\\AAA Shortcut\\Java programs\\Assignment 5\\5_2_in.txt");
        FileOutputStream out = new FileOutputStream("C:\\AAA Shortcut\\Java programs\\Assignment 5\\5_2_out.txt");
        try {
            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            in.close();
            out.close();
        }
    }
}