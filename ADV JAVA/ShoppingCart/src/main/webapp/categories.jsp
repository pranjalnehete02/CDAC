<%@ page import="java.sql.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Categories</title>
</head>
<body>
    <h2>Shopping Categories</h2>
    <table border="1">
        <tr>
            <th>Category ID</th>
            <th>Category Name</th>
            <th>Image</th>
        </tr>
        <%
            Connection con = null;
            Statement stmt = null;
            ResultSet rs = null;
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shopping", "root", "root");
                stmt = con.createStatement();
                rs = stmt.executeQuery("SELECT * FROM Categories");

                while (rs.next()) {
        %>
        <tr>
            <td><%= rs.getInt("CategoryId") %></td>
            <td><a href="products.jsp?categoryId=<%= rs.getInt("CategoryId") %>"><%= rs.getString("CategoryName") %></a></td>
            <td><img src="<%= rs.getString("Image") %>" alt="Image" width="100"></td>
        </tr>
        <%
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (con != null) con.close();
            }
        %>
    </table>
</body>
</html>
