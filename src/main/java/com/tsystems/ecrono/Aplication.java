package com.tsystems.ecrono;

import org.hibernate.Session;

import com.tsystems.ecrono.configuration.HibernateUtil;

public class Aplication {

    public static void main(String[] args) {

	Session session = HibernateUtil.getSession();

	// session = HibernateUtil.close();

    }

}
