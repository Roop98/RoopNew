package ee.sdacademy;

abstract class Abstractclass {

    final void Name(String status) {
        System.out.println("Roop");
        System.out.println(status);
    }

     abstract void age();
}

final class Student extends Abstractclass {
    @Override
    final void age() {
        System.out.println("Shut up");
    }
}

final class Mate {
    private static void main(String[] args) {
        final Abstractclass abstractclass = new Student();
        abstractclass.Name("Jobless");
        abstractclass.age();
    }
}

