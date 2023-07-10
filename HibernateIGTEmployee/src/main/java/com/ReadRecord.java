package com;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ReadRecord {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        
        SessionFactory factory=cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        
        List l=session.createQuery("from IGTEmployee").list();
        Iterator i=l.iterator();
        while(i.hasNext()) {
        	IGTEmployee ie=(IGTEmployee)i.next();
            System.out.println(ie.getId());
            System.out.println(ie.getName());
            System.out.println(ie.getAge());
            System.out.println(ie.getSalary());
            System.out.println(ie.getDesignation());
            System.out.println("============================");      	
        }
        
	}

}
