package ee.sdacademy;

public class Fourthaugust1 {

    public static void main(String[] args) {

        char astrick = '*';
        int size = 10;
        for (int i = 0; i < size; i++) {
            System.out.println(astrick);
            for (int j = 0; j < i+1; j++) {
                System.out.print(astrick);
            }
        }
    }
}
