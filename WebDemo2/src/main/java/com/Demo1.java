package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Demo1 extends HttpServlet {
//	private static final long serialVersionUID = 1L;
       
//    public Demo1() {
//        super();

//    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		String fname= request.getParameter("fname");
//		String lname= request.getParameter("lname");

		int a=Integer.parseInt(request.getParameter("aval"));
		int b=Integer.parseInt(request.getParameter("bval"));

		int sum=a+b;
		PrintWriter out=response.getWriter();
		out.print("<h1>");
		out.print("Sum is "+sum);
		out.print("</h1>");
		
		
	}


//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//		doGet(request, response);
//	}

}
