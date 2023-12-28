package com.hexaware.carconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseContext {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/carConnect";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "aaron@8dec";

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
    	
    	//loading the driver class
    	
    	Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("driver class loaded");
        
        
        //get the connection 
        Connection con = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
        System.out.println("connection established");
        
        //create the object for Statement 
        Statement st = con.createStatement();
        
        String query = "select * from customers";
        
        ResultSet rs =  st.executeQuery(query);
      
        while(rs.next()){
        	
      	  System.out.println(rs.getInt(1) + " " + rs.getString(2));
      	}
        
        //close the connection 
        con.close();
    }
}
