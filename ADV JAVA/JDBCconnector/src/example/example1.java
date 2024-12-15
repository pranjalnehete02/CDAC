
package example;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;


public class example1 {

static Connection connect = null;
static Statement stselect = null;
static Statement stinsert = null;
static Statement stupdate = null;
static ResultSet result = null;
static Scanner sc = null;
//
//void connection() throws SQLException {
//}
 
public void DisplayMenu() throws SQLException {
	sc =  new Scanner(System.in);
	
	 System.out.println("1:Register User \n" + 
	 "2:List All User based on City \n" +
	 "3:Update Password of a User \n" +
	 "4:Display user information based on User Name \n" + 
	 "5: Exit ");
	 int choose = sc.nextInt();
	 switch (choose) {
	 case 1 : RegisterUser();break;
	 case 2 : ListCity();break;
	 case 3 : PaswordUpdate();break;
	 case 4 : InfoUserName();break;
	 case 5 : CloseConnection();return;
	 default : System.out.println("Invalid choice");
	 }
 }
//case 1 : RegisterUser();break;
public void RegisterUser() throws SQLException {
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
	stinsert = connect.createStatement();
	stinsert.executeUpdate("INSERT INTO  user VALUES('" + userName + "','" + name + "','" + password + "','" + email + "','" + city +"')");
    System.out.println("User registered");
}
//case 2 : ListCity();break;
public void ListCity() throws SQLException {
	System.out.println("Enter City name :");
	String city = sc.next();
	System.out.println("Users form city : " + city );
	
	stselect = connect.createStatement();
	result = stselect.executeQuery("SELECT * FROM user WHERE city = '" + city +"' ");
	
	while(result.next()) {
		System.out.println("Username:" +result.getString("userName") 
		+ "\n Name:" + result.getString("name")
		+"\n Email:" + result.getString("email"));
	}
			
}
//case 3 : PaswordUpdate();break;
public void PaswordUpdate() throws SQLException{
	System.out.println("Enter username:");
	String userName = sc.next();
	System.out.println("Enter new password:");
	String password = sc.next();

	stupdate = connect.createStatement();
	int updatepass = stupdate.executeUpdate("UPDATE user SET password = '" +password +"'  where userName = '"+userName+"' ");
if (updatepass> 0 ) {System.out.println("Password succesfully updated");}
else {System.out.println("Invalid username");}
}
//case 4 : InfoUserName();break;
public void InfoUserName() throws SQLException {
	System.out.println("Enter username:");
	String userName = sc.next();
	
	stselect = connect.createStatement();
	result = stselect.executeQuery("SELECT * FROM user WHERE userName = '"+userName+"'");
if(result.next()) {
	System.out.println("Username:" +userName+"\n Name:" + result.getString("name") + "\n email:" + result.getString("email") + "\n city:" + result.getString("city")  );}
else {System.out.println("Username doesnt exist");}
}

//case 5 : CloseConnection();return;
public void CloseConnection() throws SQLException{
	   try {
	        if (result != null) result.close();
	        if (stselect != null) stselect.close();
	        if (stinsert != null) stinsert.close();
	        if (stupdate != null) stupdate.close();
	        if (connect != null) connect.close();

	        System.out.println("Connection closed successfully");
	    } catch (SQLException e) {
	        System.out.println("Error while closing connection: " + e.getMessage());
	    }
	

}

public static void main (String[] args) throws SQLException {
	try {
		connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_demo", "root", "cdac");
		System.out.println("Connection Successfull");
		
		new example1().DisplayMenu();

	}finally {}
	
	
}
}
