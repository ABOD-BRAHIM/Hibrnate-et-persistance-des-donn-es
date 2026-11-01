package com.emsi.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibrnateUtil {

    private static final SessionFactory sessionfactory = buildSessionFactory();


    private static SessionFactory buildSessionFactory() {
        try {

            return new Configuration().configure().buildSessionFactory();

        }catch (Throwable ex) {

            System.err.println("Échec de la création de la SessionFactory : " + ex);
            throw new ExceptionInInitializerError(ex);

        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionfactory;
    }

}
