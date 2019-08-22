package ee.sdacademy;

public class Member {
    private String Name;
    private int Age;
    private int Phonenumber;
    private String Address;


    private float Salary;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public int getPhonenumber() {
        return Phonenumber;
    }

    public void setPhonenumber(int phonenumber) {
        Phonenumber = phonenumber;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public float getSalary() {
        return Salary;
    }

    public void setSalary(float salary) {
        Salary = salary;
    }
}

class Employee extends Member {
    private String specialization;

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}

class Manager extends Employee {
    private String department;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}

class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("Roop");
        employee.setAge(21);
        employee.setAddress("E.Vilde tee,96-42");
        employee.setPhonenumber(56062267);
        employee.setSpecialization("Senior Engineer");
        employee.setSalary(2000.80f);
        System.out.println(employee.getName());
        System.out.println(employee.getAge());
        System.out.println(employee.getAddress());
        System.out.println(employee.getPhonenumber());
        System.out.println(employee.getSalary());
    }
}



