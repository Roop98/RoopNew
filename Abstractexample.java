package ee.sdacademy;

public abstract class Abstractexample {

     protected abstract void ChineseTT(String name,int age);

}
class Malong extends Abstractexample{
    @Override
    protected final void ChineseTT(String name, int age) {
        System.out.println("Name is " + name+ " and age is: " +age);
    }
}
class Fanzhendong extends Abstractexample{
    @Override
    protected final void ChineseTT(String name, int age) {
        System.out.println("name is " +name+ " and age is: " +age);
    }
}
class TTprofile{
    public static void main(String[] args) {
        Abstractexample abstractexample = new Fanzhendong();
        abstractexample.ChineseTT("Fanzhendong",22);
        Abstractexample abstractexample1 = new Malong();
        abstractexample1.ChineseTT("Malong",30);
    }
}