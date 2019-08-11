package ee.sdacademy;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;

public class Eightaugust2 {

    protected String name;
    protected float price;
}

class Wow {
    Eightaugust2 eightaugust2 = new Eightaugust2();
    HashMap<String, Float> hashMap = new HashMap<>();

    protected void control() {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("What operation you want to do [Add/View/Search/Remove/Done]:");
            String operator = scan.next();
            if (operator.equalsIgnoreCase("add"))
                askprod();
            if (operator.equalsIgnoreCase("view"))
                view();
            if (operator.equalsIgnoreCase("search"))
                search();
            if (operator.equalsIgnoreCase("done")) {
                System.out.println("operation done");
                break;
            }
        }
    }


    protected void askprod() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a product:");
        eightaugust2.name = scan.nextLine();
        System.out.println("Enter a price:");
        eightaugust2.price = scan.nextFloat();
        hashMap.put(eightaugust2.name, eightaugust2.price);
    }

    protected void view() {
        System.out.println(hashMap);
    }

    protected void search() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the product you want to search:");
        String ser = scan.next();
        Iterator<Entry<String, Float>> iterator = hashMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Entry<String, Float> entry = iterator.next();
            if (entry.getKey().equalsIgnoreCase(ser)) {
                if (ser.matches(eightaugust2.name)) {
                    System.out.println(eightaugust2.name);
                    System.out.println(eightaugust2.price);
                }
            }

        }
    }
}


class res {
    public static void main(String[] args) {
        Wow wow = new Wow();
        wow.control();
    }
}


