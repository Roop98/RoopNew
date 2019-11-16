package dbo;

import com.sun.org.apache.xpath.internal.operations.Or;
import entities.Orders;
import entities.Reservations;
import entities.Tables;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class OrdersDbo {

    public static void create(Orders orders) {
        Session session = Hibernateutil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(orders);
        transaction.commit();
    }

    public static void update(Orders orders){
        Session session = Hibernateutil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(orders);
        transaction.commit();
    }

    public static void delete(Orders orders){
        Session session = Hibernateutil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(orders);
        transaction.commit();
    }

    public static Orders getOrders(int id){
        Session session = Hibernateutil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Orders orders = session.get(Orders.class,id);
        return orders;
    }

    public static void main(String[] args) {
        Tables tables = TablesDbo.getTable(328);
        Orders orders = new Orders(1,new Timestamp(System.currentTimeMillis()),tables);

        update(orders);
    }


}
