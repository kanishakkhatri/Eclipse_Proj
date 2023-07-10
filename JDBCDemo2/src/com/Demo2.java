package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Demo2 {

	public static void main(String[] args) {
	
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/igt","root", "root");
			Statement stmt=con.createStatement();
			stmt.addBatch("insert into employee values(111,'Bharath',35,60000,'Developer')");
			stmt.addBatch("insert into employee values(222,'Bharath',35,60000,'Developer')");
			stmt.addBatch("insert into employee values(333,'Bharath',35,60000,'Developer')");
			stmt.addBatch("insert into employee values(444,'Bharath',35,60000,'Developer')");
	
			stmt.executeBatch();
			
			stmt.close();
			System.out.println("data inserted sucessfully...!");
		} 
		catch (Exception e) {
			System.out.println(e);
		}
	}
}