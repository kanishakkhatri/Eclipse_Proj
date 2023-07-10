package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

 
    public Login() {}
       
    

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name=request.getParameter("uname");
        String pass= request.getParameter("upass");
        PrintWriter out= response.getWriter();
        if(name.equalsIgnoreCase("Bhavya")&& pass.equalsIgnoreCase("Bhavya@123")) {
          out.println("LOGGED IN SUCCESSFULLY ");
          out.println("CLICK ON HOME BUTTON TO GET MORE OPTIONS  ");
          
           RequestDispatcher rd= request.getRequestDispatcher("Home.html");
            rd.forward(request, response);
        }
        else {
            out.print("<p style='color:red'>Please try once again </p>");
            out.print("<a href='Home.html'>HOME PAGE</a>");
            RequestDispatcher rd= request.getRequestDispatcher("Login.html");
            rd.include(request, response);
        
	

        }
	}
	
}