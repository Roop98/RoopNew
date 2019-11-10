package com.com.employee;

import javax.persistence.*;

@Entity
@Table(name = "VEGANRESTAURANTEMPLOYEES")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "EMPLOYEES_ID")
    private int employeeId;

    @Column(name = "NAME")
    private String name;

    @Column(name = "JOBTITLE")
    private String jobTitle;

    @Column(name = "GENDER")
    private String gender;

    @Column(name = "AGE")
    private int age;

    public Employee() {
    }

    public Employee(String employeeName, String title, String sex, int employeeAge) {
        this.name = employeeName;
        this.jobTitle = title;
        this.gender = sex;
        this.age = employeeAge;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
}
