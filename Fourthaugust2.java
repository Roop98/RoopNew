package ee.sdacademy;

import java.util.Scanner;

public class Fourthaugust2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter rows:");
        int rows = scan.nextInt();
        System.out.println("Enter columns:");
        int columns = scan.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (i == 0 || i == columns - 1 || j == 0 || j == columns - 1 || i == j || i == (columns - j - 1)) {
                    System.out.print("*");
                } else
                    System.out.print(" ");
            }
            System.out.println(" ");
        }

    }
}
