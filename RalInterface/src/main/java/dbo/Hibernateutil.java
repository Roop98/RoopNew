package dbo;


import entities.Reservations;
import entities.Tables;
import entities.Orders;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import java.util.Properties;

public class Hibernateutil {

    private static SessionFactory factory;

    public static SessionFactory getSessionFactory() {
        try {
            Configuration configuration = new Configuration();
            Properties properties = new Properties();
            properties.setProperty(Environment.DRIVER, "org.h2.Driver");
            properties.setProperty(Environment.URL, "jdbc:h2:tcp://localhost/~/test");
            properties.setProperty(Environment.USER, "sa");
            properties.setProperty(Environment.PASS, "");
            properties.setProperty(Environment.DIALECT, "org.hibernate.dialect.H2Dialect");
            properties.setProperty(Environment.SHOW_SQL, "true");
            properties.setProperty(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
            //properties.setProperty(Environment.HBM2DDL_AUTO, "createReservation");
            configuration.setProperties(properties);
            //configuration.setProperties(properties);
            configuration.addAnnotatedClass(Tables.class);
            configuration.addAnnotatedClass(Orders.class);
            configuration.addAnnotatedClass(Reservations.class);
            ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
            factory = configuration.buildSessionFactory(serviceRegistry);
        } catch (Throwable ex) {
            System.err.println("Error" + ex);
            //throw new ExceptionInInitializerError(ex);
        }
        return factory;
    }
}
