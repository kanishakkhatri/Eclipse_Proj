<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%




String name=request.getParameter("uname");
String pass= request.getParameter("upass");

if(name.equalsIgnoreCase("Bhavya")&& pass.equalsIgnoreCase("Bhavya@123")) {
  out.println("LOGGED IN SUCCESSFULLY ");
  out.println("CLICK ON HOME BUTTON TO GET MORE OPTIONS  ");
  
   RequestDispatcher rd= request.getRequestDispatcher("Home.html");
    rd.forward(request, response);
}
else {
    out.print("<p style='color:red'>Please try once again </p>");
  out.print("<a href='Home.html'>HOME PAGE</a>");
   RequestDispatcher rd= request.getRequestDispatcher("Login.jsp");
   rd.include(request, response);



}


%>
</body>
</html>