<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" import="java.sql.*"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
    body {
        background-color: onion pink;
        font-family: Arial, sans-serif;
        padding: 20px;
    }

    h1 {
        color: #333;
    }

    .record-block {
        border: 1px solid #ccc;
        background-color: #f9f7fc;
        padding: 10px;
        margin-bottom: 10px;
    }

    .record-block h2 {
        margin: 0;
        color: #333;
    }

    .record-details {
        margin-top: 10px;
        color: #666;
    }

    a {
        color: #4caf50;
    }
</style>
</head>
<body>
<h1>Records:</h1>
<%

//response.setContentType("text/html");

try {

    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/igt","root","1234");
    java.sql.Statement stmt=con.createStatement();
    ResultSet rs=stmt.executeQuery("select * from User1");

    while(rs.next()) {
        %>
        <div class="record-block">
            <h2>ID: <%= rs.getInt(1) %></h2>
            <div class="record-details">
                Name: <%= rs.getString(2) %><br>
                Ano: <%= rs.getInt(3) %><br>
                Ifsc: <%= rs.getInt(4) %><br>
                Pan: <%= rs.getInt(5) %><br>
                Adharno: <%= rs.getInt(6) %><br>
                InitialBal: <%= rs.getInt(7) %>
            </div>
        </div>
        <%
    }

    out.print("<a href='Home.html'>HOME PAGE</a>");
    out.print("</h4>");
}

catch(Exception e) {
    System.out.println(e);
}

%>
</body>
</html>
