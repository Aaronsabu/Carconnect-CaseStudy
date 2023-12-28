package com.hexaware.jdb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Test4 {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
	//loading the driver class
	
	Class.forName("com.mysql.cj.jdbc.Driver");
    System.out.println("driver class loaded");
    
    
    //get the connection 
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hexaware", "root", "aaron@8dec");
    System.out.println("i got the connection ");
    String query = "insert into student values(?,?)";
    //create the object for PreparedStatement 
    PreparedStatement ps = con.prepareStatement(query);
    
    Scanner s = new Scanner(System.in);
    
    System.out.println("enter student id:");
    int stid = s.nextInt();
    System.out.println("enter student name:");
    String stname=s.next();
    
    ps.setInt(1, stid);
    ps.setString(2, stname);
    
    int x = ps.executeUpdate();
    System.out.println(x + "row(s) inserted");
    
    //close the connection 
    con.close();
}
}
