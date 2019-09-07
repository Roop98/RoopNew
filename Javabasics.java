package ee.sdacademy;


import java.io.ObjectOutputStream;

public class Javabasics<T, K, V> {
    private T t;
    private K k;
    private V v;

     Javabasics(T tape, K cup, V violin) {
        this.t = tape;
        this.k = cup;
        this.v = violin;
    }

    final K getK() {
        return k;
    }

    final T getT() {
        return t;
    }

    final V getV() {
        return v;
    }

    protected final Object clone() throws java.lang.CloneNotSupportedException {
        throw new java.lang.CloneNotSupportedException();
    }

    private void writeObject(ObjectOutputStream out) throws java.io.IOException {
        throw new java.io.IOException("Object cannot be serialized");
    }
}

class Generics {
     public static void main(String[] args) {
        final Javabasics<String, Integer, Float> javabasics = new Javabasics<>("Roop", 21, 2000.567f);
        final String name = javabasics.getT();
        final Integer age = javabasics.getK();
        final Float salary = javabasics.getV();
        System.out.println(name + age + salary);
        final Javabasics<Integer, String, Double> javabasics1 = new Javabasics<>(23, "Sathish", 1500.45678);
        final String name1 = javabasics1.getK();
        final Integer age1 = javabasics1.getT();
        final Double salary1 = javabasics1.getV();
        System.out.println(name1 + age1 + salary1);
    }
}





