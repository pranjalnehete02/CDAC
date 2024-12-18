<%@ page import="java.sql.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Products</title>
</head>
<body>
    <h2>Products</h2>
    <table border="1">
        <tr>
            <th>Product ID</th>
            <th>Product Name</th>
            <th>Image</th>
        </tr>
        <%
            int categoryId = Integer.parseInt(request.getParameter("categoryId"));
            Connection con = null;
            Statement stmt = null;
            ResultSet rs = null;
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shopping", "root", "shopping");
                stmt = con.createStatement();
                rs = stmt.executeQuery("SELECT * FROM Products WHERE CategoryId=" + categoryId);

                while (rs.next()) {
        %>
        <tr>
            <td><%= rs.getInt("ProductId") %></td>
            <td><%= rs.getString("ProductName") %></td>
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
