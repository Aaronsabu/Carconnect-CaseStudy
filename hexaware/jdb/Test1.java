package com.hexaware.jdb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test1 {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
	//loading the driver class
	
	Class.forName("com.mysql.cj.jdbc.Driver");
    System.out.println("driver class loaded");
    
    
    //get the connection 
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hexaware", "root", "aaron@8dec");
    System.out.println("i got the connection ");
    
    //create the object for Statement 
    Statement st = con.createStatement();
    
    String query = "insert into student values(101,'anushka')";
    
    int x =  st.executeUpdate(query);
  
    System.out.println(x + "row(s) inserted");
    
    //close the connection 
    con.close();
}
}
