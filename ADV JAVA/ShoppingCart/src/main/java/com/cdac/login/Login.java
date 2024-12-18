package com.cdac.login;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static final String USERNAME = "pranjal";
	private static final String PASSWORD = "sonu";
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		if(USERNAME.equals(username) && PASSWORD.equals(password)) {
			response.sendRedirect("");
		}
		else {
			response.getWriter().print("<h3>Invalid Username password !! </h3>");
		}
		
		doGet(request, response);
	}
}
