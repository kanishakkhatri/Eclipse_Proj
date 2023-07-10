<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
</head>
<body>
<%
    // Retrieve form data
   String name = request.getParameter("uname");
        String pass = request.getParameter("upass");

        try {        
      //      ServletContext context=getServletContext();
        //    String driver=context.getInitParameter("driver");
          //  String url=context.getInitParameter("url");
           // String username=context.getInitParameter("username");
          //  String password=context.getInitParameter("password");
          //  Class.forName(driver);
          Class.forName("com.mysql.cj.jdbc.Driver");
     Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/igt", "root", "1234");
       //     Connection con = DriverManager.getConnection(url, username,password);
            PreparedStatement pstmt=con.prepareStatement("insert into Users5 values(?,?)");

                pstmt.setString(1, name);
                pstmt.setString(2, pass);
                pstmt.execute();

        
        out.print("<div style=\"background-color: #f2f2f2; text-align:center;>");
        out.print("<div style=\"max-width: 400px; margin: 0 auto; padding: 40px; background-color: #ffffff; border-radius: 5px; box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\">\r\n"
                + "    <h2 style=\"text-align: center; color: #333333;\">Registered Successfully!</h2>");

        out.print("<a href='login.html'>Login Now</a></div>");
    }

catch (Exception e) {
    System.out.println(e);
}
    
%>
</body>
</html>
