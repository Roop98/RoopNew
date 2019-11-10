package com.com.employee;

import com.menu.VeganRestaurantutil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Employeecrud {

    private static final String names[] = {"John Millman", "Jack Dawson", "Ricky Hatton", "Manny Pacquauio", "Henri Palm", "Liam Pitchford", "Paul Drinkhall", "Laura Corell"};
    private static final String jobTitle[] = {"Client Service", "Client Service", "Receptionist", "Manager", "Bar tender", "Head Chef", "Supporting Chef", "Owner"};
    private static final String gender[] = {"Male", "Male", "Male", "Female", "Male", "Male", "Male", "Female"};
    private static final int age[] = {24, 28, 31, 22, 38, 30, 35, 42};

    public void addEmployeeDetails(Employee employee) {
        Transaction transaction = null;
        try {
            Session session = VeganRestaurantutil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.save(employee);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null)
                transaction.rollback();
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < names.length; i++) {
            Employee employee = new Employee(names[i], jobTitle[i], gender[i], age[i]);
            Employeecrud employeecrud = new Employeecrud();
            employeecrud.addEmployeeDetails(employee);
        }
    }
}
