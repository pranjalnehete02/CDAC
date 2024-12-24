package com.cdac.firstDemo;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LoginAuth extends HttpServlet{
	
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

		public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
			String user_name = request.getParameter("user_name");
			String user_pw = request.getParameter("user_pw");
			
//			System.out.println(user_name);
//			System.out.println(user_pw);
			
			PrintWriter out = response.getWriter();
			out.println("The user ID is : " + user_name + "The pw is 	: " + user_pw);
			
		}
}
