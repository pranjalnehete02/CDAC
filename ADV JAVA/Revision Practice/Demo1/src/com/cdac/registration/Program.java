package com.cdac.registration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Program {
    static Connection connect = null;
    
    static Statement stSelect = null;
    static Statement stInsert = null;
    static Statement stUpdate = null;
    
    static ResultSet result = null;
    
    static Scanner sc = null;
    
    
    
    //Display the menu
    public void DisplayMenu() throws SQLException {
    	sc = new Scanner(System.in);
    	
    	System.out.println("1.Register User \n" + 
    			"2:List All User based on City \n" +
    			 "3:Update Password of a User \n" +
    			 "4:Display user information based on User Name \n" + 
    			 "5: Exit "
    			);
    	
    	int choose = sc.nextInt();
    	switch(choose) {
    	case 1: RegisterUser(); break;
    	case 2: ListCity(); break;
    	case 3: PasswordUpdate(); break;
    	case 4: InfoUserName(); break;
    	case 5: Close(); break;
    	default: System.out.println("Invalid Choice");
    	}
    }
    
    
    private void RegisterUser() throws SQLException {
		// TODO Auto-generated method stub
    	System.out.println("Enter unique username :");
    	String userName = sc.next();
    	System.out.println("Enter Your name :");
    	String name = sc.next();
    	System.out.println("Enter password:");
    	String password = sc.next();
    	System.out.println("Enter your email id :");
    	String email = sc.next();
    	System.out.println("Enter your city");
    	String city = sc.next();		
		
    	PreparedStatement pstmt = connect.prepareStatement("INSERT INTO user VALUES(?, ?, ?, ?, ?)");
    	pstmt.setString(1, userName);
    	pstmt.setString(2, name);
    	pstmt.setString(3, password);
    	pstmt.setString(4, email);
    	pstmt.setString(5, city);
    	pstmt.executeUpdate();

    	System.out.println("User Registered !");
	}


	private void ListCity() {
		// TODO Auto-generated method stub
		
	}


	private void PasswordUpdate() {
		// TODO Auto-generated method stub
		
	}

//		Display the info 
	private void InfoUserName() throws SQLException {
		// TODO Auto-generated method stub
		System.out.println("Enter the username:");
		String username = sc.next();
		
		stSelect = connect.createStatement();
		result = stSelect.executeQuery("Select * from actss WHERE username = '" + username+"'");
		
		if(result.next()) {
			System.out.println("Username: " +username+"\n Name: " +result.getString("name")+ "\nEmail: "+ result.getString("email") + "\n city:" + result.getString("city") );
		}
		else {
			System.out.println("UserName doesn't exist");
		}
	}


	private void Close() throws SQLException {
		// TODO Auto-generated method stub
		try {
		if(result != null)
			result.close();
		
		if (stSelect != null) stSelect.close();
        if (stInsert != null) stInsert.close();
        if (stUpdate != null) stUpdate.close();
        if (connect != null) connect.close();

        System.out.println("Connection closed successfully");
    } catch (SQLException e) {
        System.out.println("Error while closing connection: " + e.getMessage());
    }
	}


	public static void main(String args[]) throws SQLException {
    	try {
			connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/actss", "root", "root");
			System.out.println("Connection is established !!");
			
			new Program().DisplayMenu();
			
		} finally {}
    }
}
