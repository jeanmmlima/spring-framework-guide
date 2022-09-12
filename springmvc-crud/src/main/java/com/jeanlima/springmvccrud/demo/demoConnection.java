package com.jeanlima.springmvccrud.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class demoConnection {

    public static void main(String[] args) {
        // create session factory
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .buildSessionFactory();

        // create session
        Session session = factory.getCurrentSession();

        // add clean up code
        session.close();

        factory.close();

    }

}
