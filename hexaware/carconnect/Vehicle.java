package com.hexaware.carconnect;

public class Vehicle {
	
    private int vehicleID;
    private String model;
    private String make;
    private int year;
    private String color;
    private String registrationNumber;
    private boolean availability;
    private double dailyRate;
    
    public Vehicle() {}
    
    public Vehicle(int vehicleID, String model, String make, int year, String color, String registrationNumber, boolean availability, double dailyRate) 
    {
    	this.vehicleID = vehicleID;
    	this.model = model;
    	this.make = make;
    	this.year = year;
    	this.color = color;
    	this.registrationNumber = registrationNumber;
    	this.availability = availability;
    	this.dailyRate = dailyRate;
    }
    
    public void setVehicle(int vehicleID, String model, String make, int year, String color, String registrationNumber, boolean availability, double dailyRate) {
        this.vehicleID = vehicleID;
        this.model = model;
        this.make = make;
        this.year = year;
        this.color = color;
        this.registrationNumber = registrationNumber;
        this.availability = availability;
        this.dailyRate = dailyRate;
    }
    
    public void getVehicle() {
    	System.out.println("Vehicle ID: " +vehicleID);
    	System.out.println("Model: " +model);
    	System.out.println("Make: " +make);
    	System.out.println("Year: " +year);
    	System.out.println("Color: " +color);
    	System.out.println("Registration Number: " +registrationNumber);
    	System.out.println("Availability: " +availability);
    	System.out.println("Daily Rate: " +dailyRate);
    }
    
    public int getVehicleID() {
        return vehicleID;
    }

    public String getModel() {
        return model;
    }

    public String getMake() {
        return make;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public boolean isAvailability() {
        return availability;
    }

    public double getDailyRate() {
        return dailyRate;
    }
    
    public void setVehicleID(int vehicleID) {
        this.vehicleID = vehicleID;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }

}
