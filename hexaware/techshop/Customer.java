package com.hexaware.techshop;


public class Customer {
	
	 private int customerID;
	    private String firstName;
	    private String lastName;
	    private String email;
	    private long phone;
	    private String address;
	    
	    public Customer(int customerID, String firstName, String lastName, String email, long phone, String address) throws InvalidDataException {
	        this.customerID = customerID;
	        this.firstName = firstName;
	        this.lastName = lastName;
	        validateEmail(email);
	        this.phone = phone;
	        this.address = address;
	    }
	    
	    private void validateEmail(String email) throws InvalidDataException {
	        if (email != null && email.matches("^[\\w-_.+]*[\\w-_.]+@[\\w]+([.][\\w]+)+[\\w]$")) {
	            this.email = email;
	        } else {
	            throw new InvalidDataException("Invalid email address provided.");
	        }
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
	    
	    public long getPhone() {
	    return phone;
	    }
	    
	    public String getAddress() {
	    return address;
	    }
	
	public int CalculateTotalOrders() {
		return 0;
	};
	public void GetCustomerDetails() {
        System.out.println("Customer ID: " + customerID);
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Address: " + address);
	};
	public void UpdateCustomerInfo(String email, long phone, String address) throws InvalidDataException {
		validateEmail(email);
        this.email = email;
        this.phone = phone;
        this.address = address;
	};
	

}
