package com.hexaware.petpals;
import java.time.LocalDate;

public class CashDonation extends Donation {
    private LocalDate donationDate;

    public CashDonation(String donorName, double amount, LocalDate donationDate) {
        super(donorName, amount);
        this.donationDate = donationDate;
    }
    
    public LocalDate getDonationDate() {
        return donationDate;
    }

    public void setDonationDate(LocalDate donationDate) {
        this.donationDate = donationDate;
    }
    
    @Override
    public void recordDonation() {
        System.out.println("Cash donation recorded for: " + getDonorName() + " on " + donationDate + " with amount $" + getAmount());
        // You might add database interactions or any other recording mechanism here
    }
}
