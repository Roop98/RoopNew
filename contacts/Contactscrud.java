package com.contacts;

import com.menu.VeganRestaurantutil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Contactscrud {

    private static final String name[] = {"Aleksei Skokov", "Luis Arreaga", "Roop Ranjan Khan"};
    private static final String email[] = {"aleks@example.com", "luis@example.com", "roop@example.com"};
    private static final String phoneNumber[] = {"+37256783241", "+37267859843", "+37258938342"};

    public void addContacts(Contacts contacts) {
        Transaction transaction = null;
        try {
            Session session = VeganRestaurantutil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.save(contacts);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null)
                transaction.rollback();
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        for (int i = 0;i<name.length;i++) {
            Contacts contacts = new Contacts(name[i],email[i],phoneNumber[i]);
            Contactscrud contactscrud = new Contactscrud();
            contactscrud.addContacts(contacts);
        }
    }
}
