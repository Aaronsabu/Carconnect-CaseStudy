package com.hexaware.jdb;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Test2 {
public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
	FileInputStream input = new FileInputStream("C:\\Users\\aaron\\eclipse-workspace\\Hexaware\\src\\db.properties");
	
	Properties properties = new Properties();
	properties.load(input);
	String url = properties.getProperty("jdbc.url");
	String uname=properties.getProperty("jdbc.username");
	String password=properties.getProperty("jdbc.password");
	String drivername = properties.getProperty("jdbc.drivername");
	//load the driver class
	
	Class.forName(drivername);
	System.out.println("driver class loaded");
	Connection con = DriverManager.getConnection(url, uname, password);
	System.out.println("i got the connection");
	
	con.close();
}
}
