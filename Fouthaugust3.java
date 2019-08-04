package ee.sdacademy;

public class Fouthaugust3 {

    public static void main(String[] args) {

        int size = 10;
        for (int i = 0; i < size; i++) {
            for (int j =0;j<size-i;j++){
                System.out.print(" ");
            }
            for (int k =0;k<(2*i+1);k++)
            {
                System.out.print("*");
            }
            System.out.println();
            }
        }
    }

