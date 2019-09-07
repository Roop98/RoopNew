package ee.sdacademy;

import javax.imageio.IIOException;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Exception {
    public static void main(String[] args) {

        writeinfile(new File("C:\\roop.txt"));
    }

    private static void writeinfile(File file) {
        FileWriter fileWriter1 = null;
        try {
            fileWriter1 = new FileWriter(file);
            fileWriter1.write("My name is roop");
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter1.close();
            }
            catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
