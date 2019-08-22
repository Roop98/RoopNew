package ee.sdacademy;

import java.util.ArrayList;

public class Cartlist {
    private String name;
    private int age;
    private int id;
    // private ArrayList<String> arrayList = new ArrayList<>();
    //private ArrayList<Integer> arrayList1 = new ArrayList<>();
    //private ArrayList<Integer> arrayList2 = new ArrayList<>();

    public Cartlist(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
        //  this.arrayList = arrayList;
        //this.arrayList1 = arrayList1;
        //this.arrayList2 = arrayList2;
    }

    //public ArrayList<String> getArrayList() {
    //  return arrayList;
    //}

    //public void setArrayList(ArrayList<String> arrayList) {
    //  this.arrayList = arrayList;
    //}

    //public ArrayList<Integer> getArrayList1() {
    //  return arrayList1;
    //}

    //public void setArrayList1(ArrayList<Integer> arrayList1) {
    //  this.arrayList1 = arrayList1;
    //}

    //public ArrayList<Integer> getArrayList2() {
    //  return arrayList2;
    //}

    //public void setArrayList2(ArrayList<Integer> arrayList2) {
    //  this.arrayList2 = arrayList2;
    //}


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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
