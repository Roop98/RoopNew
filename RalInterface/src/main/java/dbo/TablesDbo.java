package dbo;

import entities.Tables;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class TablesDbo {


    public static void createTable(Tables tables) {
        try {

            SessionFactory sessionFactory = Hibernateutil.getSessionFactory();
            Session session = sessionFactory.openSession();
            Transaction transaction = session.beginTransaction();
            session.save(tables);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void deleteTable(Tables tables) {
        try {
            SessionFactory sessionFactory = Hibernateutil.getSessionFactory();
            Session session = sessionFactory.openSession();
            Transaction transaction = session.beginTransaction();
            session.delete(tables);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void updateTable(Tables tables) {
        try {
            SessionFactory sessionFactory = Hibernateutil.getSessionFactory();
            Session session = sessionFactory.openSession();
            Transaction transaction = session.beginTransaction();
            session.update(tables);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Tables getTable(int id){

        SessionFactory sessionFactory = Hibernateutil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Tables tables = session.get(Tables.class, id);
        return tables;
    }

    public static void main(String[] args) {
        Tables tables = new Tables(9, 2);
        createTable(tables);
    }
}
