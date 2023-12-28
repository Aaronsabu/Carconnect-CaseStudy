package com.hexaware.carconnect;
import java.util.Date;

public class Customer {
	
	private int customerID;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String address;
    private String username;
    private String password;
    private Date registrationDate;
    
    public Customer() {
        // Default constructor
    }


    public void setCustomerID(int customerID) {
        this.customerID = customerID;
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

    public void setAddress(String address) {
        this.address = address;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }
    
    public void setCustomer(int customerID, String firstName, String lastName, String email, String phoneNumber,
            String address, String username, String password, Date registrationDate) {
       this.customerID = customerID;
       this.firstName = firstName;
       this.lastName = lastName;
       this.email = email;
       this.phoneNumber = phoneNumber;
       this.address = address;
       this.username = username;
       this.password = password;
       this.registrationDate = registrationDate;
    }
    
    public void getCustomer() {
    	System.out.println(customerID);
    	System.out.println(firstName);
    	System.out.println(lastName);
    	System.out.println(email);
    	System.out.println(phoneNumber);
    	System.out.println(address);
    	System.out.println(username);
    	System.out.println(registrationDate);
    }
    
    
    public int getCustomerID() {
        return customerID;
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

    public String getAddress() {
        return address;
    }

    public String getUsername() {
        return username;
    }
    
    public String getPassword() {
        return password;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }


    public boolean Authenticate(String password) {
        return this.password.equals(password);
    }

}
