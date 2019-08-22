package ee.sdacademy;

import java.util.ArrayList;
import java.util.List;

public class Employer {

    private String name;
    private int age;
    private float salary;

    public Employer(String name, int age, float salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
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

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}
class Companydatabase{
    private ArrayList<Employer> employerArrayList = new ArrayList<>();

    public Companydatabase(ArrayList<Employer> employerArrayList) {
        this.employerArrayList = employerArrayList;
    }

    public ArrayList<Employer> getEmployerArrayList() {
        return employerArrayList;
    }

    public void setEmployerArrayList(ArrayList<Employer> employerArrayList) {
        this.employerArrayList = employerArrayList;
    }
}
class Employerinfo{
    public static void main(String[] args) {
        Employer employer = new Employer("Roop", 34,1456.65f);
        Employer employer1 = new Employer("Ranjan",22,1112.34f);

        ArrayList<Employer> employers = new ArrayList<>();
        employers.add(employer);
        employers.add(employer1);

        Companydatabase companydatabase = new Companydatabase(employers);
        ArrayList<Employer> employers1 = companydatabase.getEmployerArrayList();



    }
}