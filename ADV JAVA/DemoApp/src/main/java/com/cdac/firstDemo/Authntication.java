package com.cdac.firstDemo;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Authntication extends HttpServlet{

	/**
	 *     
	 */
	private static final long serialVersionUID = -6957720069735411364L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {    
		PrintWriter out = response.getWriter();
		out.println("Authentication is done !!");
		
	}
	
	
}