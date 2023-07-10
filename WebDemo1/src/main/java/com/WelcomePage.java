package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WelcomePage extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
    public WelcomePage() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response, String name) throws ServletException, IOException {
		// to print on console
		// String name=request.getParameter("uname");
        // System.out.println("Hi, My name is "+name);
        
		// to print on browser
        PrintWriter out= response.getWriter();
        out.print("<h1>");
        out.print("Hi, My name is : "+name);
        out.print("</h1>");
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
