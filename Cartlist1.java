package ee.sdacademy;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Cartlist1 {

    private int Age;
    private String nam;
    private int ID;
    private Scanner scan = new Scanner(System.in);
    private ArrayList<String> arr = new ArrayList<>();
    private ArrayList<Integer> arr1 = new ArrayList<>();
    private ArrayList<Integer> arr2 = new ArrayList<>();

    //private Cartlist cartlist = new Cartlist(nam, Age, ID);

    public void addcontact() {
        System.out.println("Enter name of student:");
        nam = scan.next();
        System.out.println("Enter age:");
        Age = scan.nextInt();
        System.out.println("Enter ID:");
        ID = scan.nextInt();
        Cartlist cartlist = new Cartlist(nam, Age, ID);
        //cartlist.getArrayList().add(name);
        //cartlist.getArrayList1().add(age);
        //cartlist.getArrayList2().add(id);
        //System.out.println(cartlist.getName());
        arr.add(cartlist.getName());
        arr1.add(cartlist.getAge());
        arr2.add(cartlist.getId());
        int a[] = {45,2,34,11,89,32};
        Arrays.sort(a);
        for (int i =0;i<a.length;i++) {
            System.out.println(a[i]);
        }
        for (int i =a.length;i>0;i--) {
            System.out.println(a[i]);
        }
    }

    public void viewcontact() {
        System.out.println(arr);
        System.out.println(arr1);
        System.out.println(arr2);
    }

    public void removecontact() {
        System.out.println("Which data you want to remove:");
        String removename = scan.next();
        for (int i = 0; i < arr.size(); i++) {
            if (removename.matches(arr.get(i))) {

                arr.remove(i);
                arr1.remove(i);
                arr2.remove(i);
            }
        }
    }
    public void searchcontact(){
        System.out.println("Which data you want to search:");
        String searchname = scan.next();
        for (int i =0;i<arr.size();i++){
            if (searchname.matches(arr.get(i))){
                System.out.println(arr.get(i));
                System.out.println(arr1.get(i));
                System.out.println(arr2.get(i));
            }
        }

    }

    public void FinalList() {
        do {
            System.out.println("What option you want 1. Add; 2. View; 3. Remove; 4. Search; 5. Done : ");
            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    addcontact();
                    break;
                case 2:
                    viewcontact();
                    break;
                case 3:
                    removecontact();
                    break;
                case 4:
                    searchcontact();
                    break;
                case 5:
                    System.out.println("operation done");
                    break;

            }


        } while (true);
    }
}
