<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bank Withdrawal</title>
<style>
    body {
        background-color: #ffb6c1; /* Onion pink */
        font-family: Arial, sans-serif;
        color: black;
    }

    .container {
        text-align: center;
        margin-top: 100px;
    }

    h1 {
        font-size: 28px;
        margin-bottom: 20px;
    }

    .record-block {
        border: 1px solid #ccc;
        background-color: #f9f7fc;
        padding: 20px;
        margin-bottom: 20px;
        text-align: left;
    }

    .record-details {
        margin-top: 10px;
        color: #666;
    }

    a {
        color: white;
        text-decoration: none;
    }
</style>
</head>
<body>
<div class="container">
<%
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

            %>
            <div class="record-block">
                <h1>Transaction Details</h1>
                <div class="record-details">
                    <strong>ID:</strong> <%= id %><br>
                    <strong>Withdrawal Amount:</strong> <%= withdrawalAmount %><br>
                    <strong>New Balance:</strong> <%= newBalance %><br>
                </div>
            </div>
            <%
            out.print("<a href='Home.html'>HOME PAGE</a>");

            System.out.println("Data Updated successfully!");
        }

        pstmt.close();
        con.close();
    } catch (Exception e) {
        System.out.println(e);
    }

    out.print("<h3>Data updated successfully!</h3>");
%>
</div>
</body>
</html>
