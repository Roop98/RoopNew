package ee.sdacademy;

public class Polymorphism {

    static double mult(double num1, int num2, float num3) {
        return num1 * num2 * num3;
    }
}

class Poly extends Polymorphism {

    static double mult(double num1, int num2, float num3) {
        return num1 * num2 - num3;
    }
}

class mate {
    public static void main(String[] args) {
        System.out.println(Poly.mult(2.5, 5, 5.67f));
        System.out.println(Polymorphism.mult(1, 6, 5.45f));
    }
}
