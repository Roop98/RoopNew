package ee.sdacademy;

interface Weird {
    void cheersmate();

    double getprice();

     int age();
}

class Weirdo implements Weird {

    @Override
    public void cheersmate() {
    }

    @Override
    public double getprice() {
        System.out.println("The price is free");
        return 3.456;
    }

    @Override
    public int age() {
        return 34;
    }
}

class Testing {
    public static void main(String[] args) {
        new Weirdo().age();
        new Weirdo().getprice();

    }
}