package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class CreateAcc extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public CreateAcc() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		    int id = Integer.parseInt(request.getParameter("uid"));
	        String name = request.getParameter("uname");
	        int Ano = Integer.parseInt(request.getParameter("uAno"));
	        int Ifsc = Integer.parseInt(request.getParameter("uIfsc"));
	        int Pan = Integer.parseInt(request.getParameter("uPan"));
	        int Adharno = Integer.parseInt(request.getParameter("uAdharno"));
	        int InitialBal = Integer.parseInt(request.getParameter("uInitialBal"));
	      
	        
	        
	        try {        
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/igt","root", "1234");
	            PreparedStatement pstmt=con.prepareStatement("insert into User1 values(?,?,?,?,?,?,?)");

	                pstmt.setFloat(1, id);
	                pstmt.setString(2, name);
	                pstmt.setInt(3, Ano);
	                pstmt.setFloat(4, Ifsc);
	                pstmt.setInt(5, Pan);
	                pstmt.setInt(6, Adharno);
	                pstmt.setInt(7, InitialBal);
	            
	                
	                pstmt.execute();


	 

	                PrintWriter out = response.getWriter();
	                out.print("<h1>");
	                out.print("ID : "+id+"<br>");
	                out.print("NAME : "+name+"<br>");
	                out.print("Ano : "+Ano+"<br>");
	                out.print("Ifsc : "+Ifsc+"<br>");
	                out.print("Pan : "+Pan+"<br>");
	                out.print("Adharno : "+Adharno+"<br>");
	                out.print("InitialBal : "+InitialBal+"<br>");
	               
	                out.println("data inserted sucessfully...!");
	               out.print("<a href='Home.html'>HOME PAGE</a>");
	                out.print("</h1>");
	        }

	        catch (Exception e) {
	            System.out.println(e);
	        }
	            }

		
			
		
	}

	
	

