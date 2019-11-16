package dbo;

import entities.Reservations;
import entities.Tables;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.sql.Timestamp;

public class ReservationsDbo {


    public static void createReservation(Reservations reservations) {
        try {

            SessionFactory sessionFactory = Hibernateutil.getSessionFactory();
            Session session = sessionFactory.openSession();
            Transaction transaction = session.beginTransaction();

            session.save(reservations);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void updateReservation(Reservations reservations) {
        try {
            SessionFactory sessionFactory = Hibernateutil.getSessionFactory();
            Session session = sessionFactory.openSession();
            Transaction transaction = session.beginTransaction();
            session.update(reservations);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void deleteReservation(Reservations reservations) {
        try {
            SessionFactory sessionFactory = Hibernateutil.getSessionFactory();
            Session session = sessionFactory.openSession();
            Transaction transaction = session.beginTransaction();

            session.delete(reservations);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Reservations getReservation(int id){
        SessionFactory sessionFactory = Hibernateutil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Reservations reservations = session.get(Reservations.class, id);
        return  reservations;
    }
    public static void main(String[] args) {
        Tables table = TablesDbo.getTable(230);
        Reservations reservations = new Reservations("Feride", new Timestamp(System.currentTimeMillis()), 3, table);

        createReservation(reservations);
    }
}
