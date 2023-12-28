package com.hexaware.petpals;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.hexaware.petpals.Donation.InsufficientFundsException;

public class Database {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner scanner = new Scanner(System.in);
	//loading the driver class
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("driver class loaded");
    
    //get the connection 
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/petsdb", "root", "aaron@8dec");
		System.out.println("connection established");
		
		 
 
		Statement st = con.createStatement();
			
		String query1 = "SELECT * FROM pets";

		ResultSet rs = st.executeQuery(query1);
  
        System.out.println("Available Pets:");
        while (rs.next()) {
            int petId = rs.getInt("petId");
            String petName = rs.getString("petName");
            int age = rs.getInt("age");
            String breed = rs.getString("breed");

            System.out.println("ID: " + petId + ", Name: " + petName + ", Age: " + age + ", Breed: " + breed);
        }
        
        System.out.println("Enter donor's information:");
        System.out.print("Name: ");
        String donorName = scanner.nextLine();
        System.out.print("Enter donation amount: ");
        double amount = scanner.nextDouble();
        
        CashDonation donation = new CashDonation(donorName, amount, null);
        try {
            donation.setAmount(amount); 
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        String query2 = "INSERT INTO donations(donorName, amount) VALUES (?,?)";
        PreparedStatement pst = con.prepareStatement(query2);
        pst.setString(1, donorName);
        if(amount>10) {
        pst.setDouble(2, amount);
        }
        
        int rowsAffected = pst.executeUpdate();
        
        if (rowsAffected > 0 && amount > 10) {
            System.out.println("Donation recorded successfully!");
        } else {
            System.out.println("Failed to record donation.");
        }
        
        
        String query3 = "SELECT * FROM adoption_events WHERE eventDate > CURDATE()";
        PreparedStatement eventStmt = con.prepareStatement(query3);
        ResultSet eventResult = eventStmt.executeQuery();
        
        System.out.println("Upcoming Adoption Events:");
        while (eventResult.next()) {
            int eventId = eventResult.getInt("eventID");
            String eventName = eventResult.getString("eventName");
            String eventDate = eventResult.getString("eventDate");
            System.out.println("Event ID: " + eventId + ", Name: " + eventName + ", Date: " + eventDate);
        }
        
        System.out.print("Enter the Event ID you want to register for: ");
        int eventID = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter your details to register for the event:");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        
        String insertQuery = "INSERT INTO participants (name, email) VALUES (?, ?)";
        PreparedStatement insertStmt = con.prepareStatement(insertQuery);
        insertStmt.setString(1, name);
        insertStmt.setString(2, email);
    
        int rowAffected = insertStmt.executeUpdate();
        if (rowAffected > 0) {
            System.out.println("Registration successful!");
        } else {
            System.out.println("Registration failed.");
        }
        
   
        eventResult.close();
        eventStmt.close();
        insertStmt.close();
        pst.close();
        rs.close();
        st.close();
        con.close();
        
	} catch (ClassNotFoundException e) {
        System.out.println("Driver class not found");
        e.printStackTrace();
    } catch (SQLException e) {
        System.out.println("Error in database connection");
        e.printStackTrace();
    } 
 }
}


