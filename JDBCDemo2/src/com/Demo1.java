package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Demo1 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
				System.out.println("Driver Loaded...!");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/igt", "root", "root");
			Statement stmt=con.createStatement();
			stmt.execute("insert into employee values(200, 'Bharat', 35, 60000, 'Developer')");
			stmt.close();
				System.out.println("Data inserted successfully...!");

			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
