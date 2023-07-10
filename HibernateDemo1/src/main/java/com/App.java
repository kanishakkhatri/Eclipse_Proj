package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        Department e = new Department();
        e.setUid(111);
        e.setName("Manshe");
        e.setDesignation("Tester");
        session.save(e);
        tx.commit();
        System.out.println("Data inserted Successfully!");
    }
}
