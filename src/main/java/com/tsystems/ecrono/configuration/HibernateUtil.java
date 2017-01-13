package com.tsystems.ecrono.configuration;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tsystems.ecrono.domain.DorsalEntity;
import com.tsystems.ecrono.domain.MachineEntity;
import com.tsystems.ecrono.domain.RaceEntity;
import com.tsystems.ecrono.domain.RunnerEntity;
import com.tsystems.ecrono.domain.TimeStampEntity;

public class HibernateUtil {

    private static final SessionFactory sessionFactory;
    static {
	try {
	    sessionFactory = new Configuration()//
		    .addAnnotatedClass(DorsalEntity.class)//
		    .addAnnotatedClass(MachineEntity.class)//
		    .addAnnotatedClass(RaceEntity.class)//
		    .addAnnotatedClass(RunnerEntity.class)//
		    .addAnnotatedClass(TimeStampEntity.class)//
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
