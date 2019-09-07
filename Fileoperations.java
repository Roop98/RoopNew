package ee.sdacademy;

import java.io.*;
import java.util.Scanner;

public class Fileoperations {
    public static void main(String[] args) {
        //File file = new File("roop1.txt");
        //First method try catch method which requires the file to be closed
        try {
            FileWriter fileWriter = new FileWriter("roop1.txt");
            fileWriter.write("My name is roop");
            fileWriter.write("Age is something like 21");
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Exception caught");
        }
        // Reading from the above file and printing the contents on the console
        try (FileReader fileReader = new FileReader("roop1.txt")) {
            Scanner fi = new Scanner(new File("roop1.txt"));
            System.out.println(fi.nextLine());
            //String line = fi.nextLine();
        } catch (IOException e) {
            System.out.println("Exception caught again");
        }


        //Second method is try with resources which doesnt require file to be closed its automatically closed
        try (FileWriter fileWriter = new FileWriter("roop2.txt")) {
            fileWriter.write("\n 245");
            fileWriter.write("Good morning");
            fileWriter.write("How are you");

        } catch (IOException e) {
            System.out.println("Exception caught");
        } finally {
            System.out.println("Printing regardless of anything else");
        }

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("roop2.txt"))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line.length());
            }
        } catch (IOException e) {
            System.out.println("Catching again");
        }
    }
}
