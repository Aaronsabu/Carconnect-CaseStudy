package com.hexaware.carconnect;
import java.util.Date;

public class Reservation {
	
    private int reservationID;
    private int customerID;
    private int vehicleID;
    private Date startDate;
    private Date endDate;
    private double totalCost;
    private String status;
    
    public void setReservation(int reservationID, int customerID, int vehicleID, Date startDate, Date endDate, double totalCost, String status) {
        this.reservationID = reservationID;
        this.customerID = customerID;
        this.vehicleID = vehicleID;
        this.startDate = startDate;
        this.endDate = endDate;
        this.totalCost = totalCost;
        this.status = status;
    }

    public void getReseration() {
        System.out.println("Reservation ID: " + reservationID);
        System.out.println("Customer ID: " + customerID);
        System.out.println("Vehicle ID: " + vehicleID);
        System.out.println("Start Date: " + startDate);
        System.out.println("End Date: " + endDate);
        System.out.println("Total Cost: " + totalCost);
        System.out.println("Status: " + status);
    }
    
    public void setReservationID(int reservationID) {
        this.reservationID = reservationID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public void setVehicleID(int vehicleID) {
        this.vehicleID = vehicleID;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public int getReservationID() {
        return reservationID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public int getVehicleID() {
        return vehicleID;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public String getStatus() {
        return status;
    }
    
    public double calculateTotalCost() {
    	return 0.0;
    }
    

}
