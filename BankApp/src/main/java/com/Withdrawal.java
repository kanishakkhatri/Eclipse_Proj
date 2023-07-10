package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Withdrawal extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Withdrawal() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());

		int id = Integer.parseInt(request.getParameter("uid"));
		int withdrawalAmount = Integer.parseInt(request.getParameter("uWithdrawalAmount"));

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/igt", "root", "1234");

			String selectSql = "SELECT InitialBal FROM User1 WHERE id = ?";
			PreparedStatement pstmt = con.prepareStatement(selectSql);
			pstmt.setInt(1, id);

			ResultSet resultSet = pstmt.executeQuery();

			if (resultSet.next()) {
				double currentBalance = resultSet.getDouble("InitialBal");
				double newBalance = currentBalance - withdrawalAmount;

				String updateSql = "UPDATE User1 SET InitialBal = ? WHERE id = ?";
				PreparedStatement updatePstmt = con.prepareStatement(updateSql);
				updatePstmt.setDouble(1, newBalance);
				updatePstmt.setInt(2, id);
				updatePstmt.executeUpdate();

				updatePstmt.close();

				PrintWriter out = response.getWriter();

				out.print("<h1>");
				out.print("ID: " + id);
				out.print("<br>");
				out.print("Withdrawal: " + withdrawalAmount);
				out.print("<br>");
				out.print("New Balance: " + newBalance);
				out.print("<br>");
				out.print("<a href='Home.html'>HOME PAGE</a>");
				out.print("</h1>");

				System.out.println("Data Updated successfully!");
			}

			pstmt.close();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}

		PrintWriter out = response.getWriter();
		out.print("<h3>Data updated successfully!</h3>");
	}
}
