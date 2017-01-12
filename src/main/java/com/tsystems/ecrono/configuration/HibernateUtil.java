package com.tsystems.ecrono.configuration;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private static final SessionFactory sessionFactory;
    static {
	try {
	    sessionFactory = new Configuration()//
		    .buildSessionFactory();
	} catch (Throwable ex) {
	    throw new ExceptionInInitializerError(ex);
	}
    }

    public static Session getSession() throws HibernateException {
	return sessionFactory.openSession();
    }

    public static void close() {
	sessionFactory.close();
    }
}
