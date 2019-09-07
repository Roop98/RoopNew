package ee.sdacademy;

public class Polymorphismexample {

    public String word(String name, int age){
        System.out.println("name is: " + name+ " and age is: " + age);
        return name;
    }
    public String word(String name,int age,String ID){
        System.out.println(name + age + ID);
        return name;
    }
    public double word(double age,double dip){
        System.out.println(age+dip);
        return age+dip;
    }
}
class Polymorphismexample1 extends Polymorphismexample{

    @Override
    public String word(String name, int age) {
        System.out.println("Name is: " +name+ " and age is: " +age);
        return name;
    }
}
class Poly{
    public static void main(String[] args) {
        Polymorphismexample1 polymorphismexample1 = new Polymorphismexample1();
        polymorphismexample1.word("Malong",30);
        Polymorphismexample polymorphismexample = new Polymorphismexample();
        polymorphismexample.word("ZhangJike",28);
        polymorphismexample.word("FanZhendong",22,"46736bsbv");
        polymorphismexample.word(2.345,4.32);
    }
}