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
            PreparedStatement stmt = null;
            ResultSet rs = null;

            try {
                // Load the JDBC driver (ensure it's available in the classpath)
                Class.forName("com.mysql.cj.jdbc.Driver");
                
                // Establish database connection
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shopping", "root", "shopping");

                // Use prepared statement to avoid SQL injection
                String sql = "SELECT * FROM Products WHERE CategoryId = ?";
                stmt = con.prepareStatement(sql);
                stmt.setInt(1, categoryId); // Set the categoryId parameter

                // Execute query and process the result set
                rs = stmt.executeQuery();

                while (rs.next()) {
        %>
        <tr>
            <td><%= rs.getInt("ProductId") %></td>
            <td><%= rs.getString("ProductName") %></td>
            <td><img src="<%= rs.getString("Image") %>" alt="Image" width="100"></td>
        </tr>
        <%
                }
            } catch (SQLException e) {
                out.println("<h3>Error fetching data from the database: " + e.getMessage() + "</h3>");
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                out.println("<h3>JDBC Driver not found: " + e.getMessage() + "</h3>");
                e.printStackTrace();
            } finally {
                // Properly close all resources
                try {
                    if (rs != null) rs.close();
                    if (stmt != null) stmt.close();
                    if (con != null) con.close();
                } catch (SQLException e) {
                    out.println("<h3>Error closing resources: " + e.getMessage() + "</h3>");
                    e.printStackTrace();
                }
            }
        %>
    </table>
</body>
</html>
