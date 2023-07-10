package com;

import java.util.Scanner;

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
        
        IGTEmployee ie = new IGTEmployee();
//        ie.setId(100);
//        ie.setName("Kanishak");
//        ie.setAge(22);
//        ie.setSalary(50000);
//        ie.setDesignation("Tester");
        
        //dynamic 
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Id: ");
        int id=sc.nextInt();
        
        System.out.println("Enter Name: ");
        String name=sc.next();
        
        System.out.println("Enter Age: ");
        int age=sc.nextInt();
        
        System.out.println("Enter Salary: ");
        int salary=sc.nextInt();
        
        System.out.println("Enter Designation: ");
        String designation=sc.next();
        
        ie.setId(id);
        ie.setName(name);
        ie.setAge(age);
        ie.setSalary(salary);
        ie.setDesignation(designation);

        
        session.save(ie);
        tx.commit();
        
        System.out.println("Data inserted Successfully!");
	}

}
