<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"% import="java.sql.*"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
	</head>
	<body>
		
		<%
			int id=Integer.parseInt(request.getParameter("uid"));
			String name=request.getParameter("uname");
			int age=Integer.parseInt(request.getParameter("uage"));
			int salary=Integer.parseInt(request.getParameter("usalary"));
			String designation=request.getParameter("udesignation");
					
			try {
				Class.forName("com.mysql.jdbc.Driver");
					System.out.println("Driver Loaded...!");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/igt", "root", "root");
				PreparedStatement pstmt=con.prepareStatement("insert into employee values(?,?,?,?,?)");			
				pstmt.setInt(1, id);
				pstmt.setString(2, name);
				pstmt.setInt(3, age);
				pstmt.setInt(4, salary);
				pstmt.setString(5, designation);
				pstmt.execute();
				
				out.print("<h1>");
				out.print("Data Inserted...!");
				out.print("</h1>");

			}
			catch(Exception e) {
				System.out.println(e);
			}
		%>
	</body>
</html>