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
            int id = Integer.parseInt(request.getParameter("uid"));
            String name = request.getParameter("uname");
            int Accno = Integer.parseInt(request.getParameter("uAno"));
            int Ifsc = Integer.parseInt(request.getParameter("uIfsc"));
            int Pan = Integer.parseInt(request.getParameter("uPan"));
            int Adharno = Integer.parseInt(request.getParameter("uAdharno"));
            int InitialBal = Integer.parseInt(request.getParameter("uInitialBal"));
            
       //     int DepositAmt = Integer.parseInt(request.getParameter("uDeposit_Amt"));
         //   int WithdrawalAmt = Integer.parseInt(request.getParameter("uWithdrawalAmt"));

 


            try {        
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/igt","root", "1234");
                   PreparedStatement pstmt=con.prepareStatement("insert into User1 values(?,?,?,?,?,?,?)");

                    pstmt.setFloat(1, id);
                    pstmt.setString(2, name);
                    pstmt.setInt(3, Accno);
                    pstmt.setFloat(4, Ifsc);
                    pstmt.setInt(5, Pan);
                    pstmt.setInt(6, Adharno);
                    pstmt.setInt(7, InitialBal);
                    
                    pstmt.execute();

 

                    out.print("<h1>");
                    out.print("ID : "+id+"<br>");
                    out.print("NAME : "+name+"<br>");
                    out.print("Ano : "+Accno+"<br>");
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
              %>
</body>
</html>

