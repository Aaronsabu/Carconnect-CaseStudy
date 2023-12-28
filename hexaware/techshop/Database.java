package com.hexaware.techshop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
	//loading the driver class
	
	Class.forName("com.mysql.cj.jdbc.Driver");
    System.out.println("driver class loaded");
    
    
    //get the connection 
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hexaware", "root", "aaron@8dec");
    System.out.println("i got the connection ");
    
    //create the object for Statement 
    Statement st = con.createStatement();
    
    String query1 = "create table customers(customerID int primary key, firstName varchar(20), lastName varchar(20),email varchar(50))";
//    String query2 = "insert into customers value"
    int x =  st.executeUpdate(query1);
  
    System.out.println(x + "row(s) inserted");
    
    //close the connection 
    con.close();
}
}

