

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class CheckBal extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public CheckBal() {
        super();
     
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/igt","root","1234");
            PrintWriter out=response.getWriter();
            java.sql.Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from User1");
            out.print("<h4>");
            while(rs.next())
            {
                out.print(rs.getInt(1)+":"+rs.getString(2)+":"+rs.getInt(3)+":"+rs.getInt(4)+":"+rs.getInt(5)+":"+rs.getInt(6)+":"+rs.getInt(7));
                out.print("<br>");
       //         out.print("<a href='Index.html'>HOME PAGE</a>");
            }
            out.print("</h4>");
        }
        catch(Exception e)
        {
            System.out.println(e);    
        }    
		
	}

	}

	
	

