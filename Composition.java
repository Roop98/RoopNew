package ee.sdacademy;

public class Composition {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Composition(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
class Student{
    private int height;
    private float weight;
    private Composition composition;

    public Student(int Height,float Weight,Composition composition1){
        this.height = Height;
        this.weight = Weight;
        this.composition = composition1;
    }

    public float getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    public Composition getComposition() {
        return composition;
    }
}
class Result{
    public static void main(String[] args) {
        Student student = new Student(180,66.45f,new Composition("Roop",21));
        System.out.println(student.getHeight());
        System.out.println(student.getWeight());

    }
}