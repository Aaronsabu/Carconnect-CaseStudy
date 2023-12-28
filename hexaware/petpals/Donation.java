package com.hexaware.petpals;

public abstract class Donation {
	
	public class InsufficientFundsException extends Exception {
	    public InsufficientFundsException(String message) {
	        super(message);
	    }
	}
	
    private String donorName;
    private double amount;
    
    public Donation(String donorName, double amount) {
        this.donorName = donorName;
        this.amount = amount;
    }
    
    public String getDonorName() {
        return donorName;
    }

    public double getAmount() {
        return amount;
    }
    
	    public void setAmount(double amount) throws InsufficientFundsException{
	    	if (amount < 10) {
	    		throw new InsufficientFundsException("Minimum donation amount should be $10.");  	        
	    	}
	    	this.amount = amount;  	        
	    }
    
    public abstract void recordDonation();
}
