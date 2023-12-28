package com.hexaware.carconnect;
import java.util.Date;

public class Admin {
	
    private int adminID;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String username;
    private String password;
    private String role;
    private Date joinDate;
    
    public void setAdminID(int adminID) {
        this.adminID = adminID;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }

    public void getAdmin() {
    	System.out.println("Admin ID: " + adminID);
    	System.out.println("First Name: " + firstName);
    	System.out.println("Last Name: " + lastName);
    	System.out.println("Email: " + email);
    	System.out.println("Phone Number: " + phoneNumber);
    	System.out.println("Username: " + username);
    	System.out.println("Password: " + password);
    	System.out.println("Role: " + role);
    	System.out.println("Join Date: " + joinDate);
    }
    
    public int getAdminID() {
        return adminID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }

    public Date getJoinDate() {
        return joinDate;
    }
    
    public boolean Authenticate(String inputPassword) {
        return this.password.equals(inputPassword);
    }

}
