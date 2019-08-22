package ee.sdacademy;

import com.sun.javafx.UnmodifiableArrayList;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;

public class Student {

    private String name;
    private int age;
    private int ID;

    public Student(String name, int age, int ID) {
        this.name = name;
        this.age = age;
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}

class Universitydatabase {

    private List<Student> students = new LinkedList<>();

    public Universitydatabase(List<Student> students) {
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }
}

class Database {
    public static void main(String[] args) {

        Student student = new Student("Roop", 34, 5677);
        Student student1 = new Student("Ranjan", 22, 2234);

        List<Student> studentList = new LinkedList<>();
        studentList.add(student);
        studentList.add(student1);

        Universitydatabase universitydatabase = new Universitydatabase(studentList);
        List<Student> students = universitydatabase.getStudents();
        System.out.println(students.containsAll(studentList));

    }
}